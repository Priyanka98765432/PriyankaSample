package SamplePrjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertnPgm {
	
	@Test
	
	private void tc1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.facebook.com/");
		String actualURL = drvr.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualURL, "https://www.facebook.com/");
		System.out.println("FB Page Launched");
		s.assertAll();
	}
	
	@Test
private void tc2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.google./");
		String actualURL = drvr.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualURL, "https://www.facebook.com/");
		System.out.println("Google PAge Launched");
		s.assertAll();
	}

}
