package com.pojoclsAdactn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClsPckage.BasClsPgm1;

public class AdactnSelectHotelPage extends BasClsPgm1 {
	
	public AdactnSelectHotelPage() {
		PageFactory.initElements(drvr, this);
	}
	
	@FindBy(xpath="//*[text()='Select Hotel ']")
	WebElement selcthtl;
	@FindBy(id="radiobutton_0")
	WebElement rdiobtn;
	@FindBy(id="continue")
	WebElement clckcntnu;
	
	public WebElement getSelcthtl() {
		String s2 = selcthtl.getText();
		System.out.println(s2);
		return selcthtl;
		
	}
	public WebElement getRdiobtn() {
		return rdiobtn;
		
	}
	public WebElement getClckcntnu() {
		return clckcntnu;
		
	}

}
