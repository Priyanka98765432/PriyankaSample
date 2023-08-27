package com.pojoclsAdactn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClsPckage.BasClsPgm1;

public class AdactnLoginPage extends BasClsPgm1 {
	
	public AdactnLoginPage() {
		PageFactory.initElements(drvr, this);
	}
	
	@FindBy(id = "username")
	private WebElement user;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
	private WebElement logn;
	
	public WebElement getUser() {
		return user;
		
	}
	public WebElement getPass() {
		return pass;
		
	}
	public WebElement getLogn() {
		return logn;
		
	}

}
