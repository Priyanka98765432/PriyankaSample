package SamplePrjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssrtnPgm1 {
	
	@Test
	
	private void tc1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.facebook.com/");
		String actualURL = drvr.getCurrentUrl();
		Assert.assertEquals(actualURL, "https://www.facebook.com/");
		System.out.println("FB Page Launched");
	}
	
	@Test
	
	private void tc2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.google./");
		String actualURL = drvr.getCurrentUrl();
		Assert.assertEquals(actualURL, "https://www.google.com/", "Title Mismatched");
		System.out.println("Google Page Launched");
	}

}
