package SamplePrjct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFCAutoPgm {
	
	@Test
	
	private void tc1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://netbanking.hdfcbank.com/netbanking/");
		
		List<WebElement> totalCount = drvr.findElements(By.tagName("frameset"));
		
		int s = totalCount.size();
		System.out.println("Total Frame Count  : " + s);
		
		drvr.switchTo().frame("login_page");
		
		drvr.findElement(By.name("fldLoginUserId")).sendKeys("Besant");
	}

}
