package com.pojoclsAdactn;

import BaseClsPckage.BasClsPgm1;

public class AdactnPojoExcutn extends BasClsPgm1 {

	public static void main(String[] args) {
		
		browserLaunch("https://adactinhotelapp.com/");
		browserMaxmiz();
		
		AdactnLoginPage algn = new AdactnLoginPage();
		
		algn.getUser().sendKeys("PriyankaKasoju");
		algn.getPass().sendKeys("SeleniumTesting");
		algn.getLogn().click();
		
		AdactnSearchHotelPage asearch = new AdactnSearchHotelPage();
		
		asearch.getSrchtxt();
		asearch.getLocatn();
		asearch.getHtls();
		asearch.getRoom();
		asearch.getNumfrooms();
		asearch.getAdults();
		asearch.getChildren();
		asearch.getSearch().click();
		
		AdactnSelectHotelPage aselect = new AdactnSelectHotelPage();
		
		aselect.getSelcthtl();
		aselect.getRdiobtn().click();
		aselect.getClckcntnu().click();
		
		AdactnBookHotelPage abook = new AdactnBookHotelPage();
		
		abook.getBooktxt();
		abook.getFname();
		abook.getLname();
		abook.getAdrs();
		abook.getCardtext();
		abook.getCnum();
		abook.getCtype();
		abook.getCmnth();
		abook.getCyear();
		abook.getCvv();
		abook.getBknow();
		abook.getBktxt();
		
		AdactnBookingConfrmtnPage aconfirm = new AdactnBookingConfrmtnPage();
		
		aconfirm.getOrdrnum();
		aconfirm.getLgout();
				

	}

}
