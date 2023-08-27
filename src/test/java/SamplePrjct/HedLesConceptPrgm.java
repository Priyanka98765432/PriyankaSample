package SamplePrjct;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HedLesConceptPrgm {
 
	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
		c.addArguments("headless");
		
		WebDriver drvr = new ChromeDriver(c);
		drvr.get("https://www.facebook.com/");
		drvr.manage().window().maximize();
		
		System.out.println(drvr.getCurrentUrl());
		
		System.out.println(drvr.getTitle());

	}

}
