package com.ada.Arvind;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pojo.LoginPage;
import com.pojo.SearchPage;
import com.pom.PageObjectManager_POM;
import com.properties.File_Reader;

public class Adactin_Project extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = getbrowser(File_Reader.getInstance_Fr().getInstance_cr().get_browser());
		getUrl(File_Reader.getInstance_Fr().getInstance_cr().get_url());

		PageObjectManager_POM pom = new PageObjectManager_POM(driver);

		Inputs(pom.getInstanceLp().getUsername(), File_Reader.getInstance_Fr().getInstance_cr().get_uname());
		Inputs(pom.getInstanceLp().getPassword(), File_Reader.getInstance_Fr().getInstance_cr().get_pass());
		click(pom.getInstanceLp().getLogin());
		dropDown(pom.getInstanceSpage().getLoc(), "byindex",
				File_Reader.getInstance_Fr().getInstance_cr().get_dropdown());
		dropDown(pom.getInstanceSpage().getHote(), "byindex", "2");
		dropDown(pom.getInstanceSpage().getRoom(), "byindex", "2");
		dropDown(pom.getInstanceSpage().getRoom_no(), "byindex", "2");
		click(pom.getInstanceSpage().getIn());
		clear(pom.getInstanceSpage().getIn());
		Inputs(pom.getInstanceSpage().getIn(), "22/07/2022");
		click(pom.getInstanceSpage().getOut());
		clear(pom.getInstanceSpage().getOut());
		Inputs(pom.getInstanceSpage().getOut(), "23/07/2022");
		dropDown(pom.getInstanceSpage().getAr(),"byindex","1");
		dropDown(pom.getInstanceSpage().getCr(), "byindex","1");
		click(pom.getInstanceSpage().getSubmit());
        click(pom.getInstanceSpage().getR_button());
        click(pom.getInstanceSpage().getCont());
        click(pom.getInstanceSpage().getF_name());
        Inputs(pom.getInstanceSpage().getF_name(), "Arvind");
        click(pom.getInstanceSpage().getL_name());
        Inputs(pom.getInstanceSpage().getL_name(), "vj");
        click(pom.getInstanceSpage().getAdd());
        Inputs(pom.getInstanceSpage().getAdd(), "ramapuram,Chennai");
        click(pom.getInstanceSpage().getCredit());
        Inputs(pom.getInstanceSpage().getCredit(), "1234567887654321");
        click(pom.getInstanceSpage().getCredittype());
        dropDown(pom.getInstanceSpage().getCredittype(), "byindex","1");
        click(pom.getInstanceSpage().getCc_exp());
        dropDown(pom.getInstanceSpage().getCc_exp(), "byindex","11");
        click(pom.getInstanceSpage().getExp_yr());
        dropDown(pom.getInstanceSpage().getExp_yr(), "byindex","11");
        click(pom.getInstanceSpage().getCvv());
        Inputs(pom.getInstanceSpage().getCvv(), "342");
        click(pom.getInstanceSpage().getBook());
        waits();
        click(pom.getInstanceSpage().getLog_out());
        

        
	}
}
