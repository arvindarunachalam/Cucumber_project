package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement loc;

	@FindBy(id = "hotels")
	private WebElement hote;

	@FindBy(id = "room_type")
	private WebElement room;
	@FindBy(id = "room_nos")
	private WebElement room_no;

	public WebElement getRoom_no() {
		return room_no;
	}

	@FindBy(id = "datepick_in")
	private WebElement in;

	@FindBy(id = "datepick_out")
	private WebElement out;

	@FindBy(id = "adult_room")
	private WebElement ar;

	@FindBy(id = "child_room")
	private WebElement cr;

	@FindBy(id = "Submit")
	private WebElement submit;

	@FindBy(id = "radiobutton_0")
	private WebElement r_button;

	@FindBy(id = "continue")
	private WebElement cont;

	@FindBy(id = "first_name")
	private WebElement f_name;

	@FindBy(id = "last_name")
	private WebElement l_name;
	
	@FindBy(id="address")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}

	@FindBy(id = "cc_num")
	private WebElement credit;

	@FindBy(id = "cc_type")
	private WebElement credittype;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp;

	@FindBy(id = "cc_exp_year")
	private WebElement exp_yr;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement book;

	@FindBy(id = "logout")
	private WebElement log_out;

	public WebElement getHote() {
		return hote;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getIn() {
		return in;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getAr() {
		return ar;
	}

	public WebElement getCr() {
		return cr;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getR_button() {
		return r_button;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getF_name() {
		return f_name;
	}

	public WebElement getL_name() {
		return l_name;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getCc_exp() {
		return cc_exp;
	}

	public WebElement getExp_yr() {
		return exp_yr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
    
	

	public WebElement getLog_out() {
		return log_out;
	}

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoc() {
		return loc;

	}

}