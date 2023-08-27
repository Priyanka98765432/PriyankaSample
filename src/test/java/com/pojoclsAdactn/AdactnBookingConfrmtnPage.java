package com.pojoclsAdactn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClsPckage.BasClsPgm1;

public class AdactnBookingConfrmtnPage extends BasClsPgm1 {
	
	public AdactnBookingConfrmtnPage() {
		PageFactory.initElements(drvr, this);
		
	}
	
	@FindBy(id="order_no")
	private WebElement ordrnum;
	@FindBy(id="logout")
	private WebElement lgout;
	
	public WebElement getOrdrnum() {
		String stxt = ordrnum.getAttribute("value").toString();
		System.out.println(stxt);
		return ordrnum;
		
	}
	public WebElement getLgout() {
		lgout.click();
		return lgout;
		
	}
	

}
