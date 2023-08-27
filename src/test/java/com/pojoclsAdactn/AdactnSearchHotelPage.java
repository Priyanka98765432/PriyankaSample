package com.pojoclsAdactn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClsPckage.BasClsPgm1;

public class AdactnSearchHotelPage extends BasClsPgm1 {
	
	public AdactnSearchHotelPage() {
		PageFactory.initElements(drvr, this);

	}
	@FindBy(xpath="//*[text()='Search Hotel ']")
	private WebElement srchtxt;
	
	@FindBy(id = "location")
	private WebElement locatn;
	@FindBy(id = "hotels")
	private WebElement htls;
	@FindBy(id = "room_type")
	private WebElement room;
	@FindBy(id = "room_nos")
	private WebElement numfrooms;
	@FindBy(id = "adult_room")
	private WebElement adults;
	@FindBy(id = "child_room")
	private WebElement children;
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getSrchtxt() {
		String s1 = srchtxt.getText();
		System.out.println(s1);
		return srchtxt;
	}
	
	public WebElement getLocatn() {
		Select s1 = new Select(locatn);
		s1.selectByVisibleText("London");
		return locatn;
		
	}
	public WebElement getHtls() {
		Select s2 = new Select(htls);
		s2.selectByValue("Hotel Sunshine");
		return htls;
		
	}
	public WebElement getRoom() {
		Select s2 = new Select(room);
		s2.selectByValue("Standard");
		return room;
		
	}
	public WebElement getNumfrooms() {
		Select s2 = new Select(numfrooms);
		s2.selectByValue("2");
		return numfrooms;
		
	}
	public WebElement getAdults() {
		Select s2 = new Select(adults);
		s2.selectByValue("2");
		return adults;
		
	}
	public WebElement getChildren() {
		Select s2 = new Select(children);
		s2.selectByValue("2");
		return children;
		
	}
	public WebElement getSearch() {
		return search;
		
	}
	

}
