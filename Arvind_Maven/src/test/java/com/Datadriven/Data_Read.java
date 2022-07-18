package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {
    public static void main(String[] args) throws IOException {
    	File f=new File("C:\\Users\\aruna\\OneDrive\\Desktop\\DataExcel.xlsx");
		FileInputStream fis=new FileInputStream(f); 
		Workbook wb = new XSSFWorkbook(fis);  
		
		 Sheet sh = wb.getSheet("Reg.Info");
		 Row r = sh.getRow(1);
		 Cell cell = r.getCell(1);
		CellType cellType = cell.getCellType();
    	
		if (cellType.equals(cellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println("string value----->  "+scv);
		}
		else {
			double nv = cell.getNumericCellValue();
			System.out.println("Numeric value-----> "+nv);
		}
		int pnr = sh.getPhysicalNumberOfRows();
		System.out.println("Total no. of rows-----> "+pnr);
		
		for (int i = 0; i < pnr; i++) {
			Row row = sh.getRow(i);
			int size = row.getPhysicalNumberOfCells();
			System.out.println("no. of cells-----> "+size);
			
			for (int j = 0; j < size; j++) {
				Cell cc = row.getCell(j);
				String sv = cc.getStringCellValue();
				System.out.println(sv);
			}
		}
		System.out.println("");
	}
}
 