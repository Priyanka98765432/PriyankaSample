package com.pojoclsAdactn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClsPckage.BasClsPgm1;

public class AdactnBookHotelPage extends BasClsPgm1 {
	
	public AdactnBookHotelPage() {
		PageFactory.initElements(drvr, this);
		
	}
	@FindBy(xpath="//*[text()='Book A Hotel ']")
	private WebElement booktxt;
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement adrs;
	@FindBy(xpath="//*[text()='Use 16 digit Dummy Data']")
	private WebElement cardtext;
	@FindBy(id="cc_num")
	private WebElement cnum;
	@FindBy(id="cc_type")
	private WebElement ctype;
	@FindBy(id="cc_exp_month")
	private WebElement cmnth;
	@FindBy(id="cc_exp_year")
	private WebElement cyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bknow;
	@FindBy(xpath="//*[text()='Please wait! We are processing your Hotel Booking...']")
	private WebElement bktxt;
	
	
	public WebElement getBooktxt() {
		String s3 = booktxt.getText();
		System.out.println(s3);
		return booktxt;
		
	}
	public WebElement getFname() {
		fname.sendKeys("Priyanka");
		return fname;
		
	}
	public WebElement getLname() {
		lname.sendKeys("Kasoju");
		return lname;
		
	}
	public WebElement getAdrs() {
		adrs.sendKeys("Bangalore");
		return adrs;
		
	}
	public WebElement getCardtext() {
		String ss = cardtext.getText();
		System.out.println(ss);
		return cardtext;
	}
	public WebElement getCnum() {
		cnum.sendKeys("1234567891234567");
		return cnum;
		
	}
	public WebElement getCtype() {
		Select s = new Select(ctype);
		s.selectByValue("MAST");
		return ctype;
	}
	public WebElement getCmnth() {
		Select s = new Select(cmnth);
		s.selectByValue("10");
		return cmnth;
	}
	public WebElement getCyear() {
		Select s = new Select(cyear);
		s.selectByValue("2026");
		return cyear;
	}
	public WebElement getCvv() {
		cvv.sendKeys("123");
		return cvv;
		
	}
	public WebElement getBknow() {
		bknow.click();
		return bknow;
	}
	public WebElement getBktxt() {
		String st = bktxt.getText();
		System.out.println(st);
		return bktxt;
	}
	

}
