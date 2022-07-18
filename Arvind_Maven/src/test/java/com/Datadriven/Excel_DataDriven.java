package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_DataDriven {
	public static void main(String[] args) throws IOException {
		
//		File--->FIS--->WB--->SHEET--->Row--->Cell--->FOS
		
		File f=new File("C:\\Users\\aruna\\OneDrive\\Desktop\\DataExcel.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("Reg.Info");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Stu.Info");
		
		wb.getSheet("Reg.Info").createRow(3);
		wb.getSheet("Reg.Info").createRow(1);
		wb.getSheet("Reg.Info").createRow(2);
		
		wb.getSheet("Reg.Info").getRow(3).createCell(0).setCellValue("Arvi");
		wb.getSheet("Reg.Info").getRow(1).createCell(1).setCellValue("teejay");
		wb.getSheet("Reg.Info").getRow(2).createCell(2).setCellValue("vijay");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		 
		System.out.println("data inserted check");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
