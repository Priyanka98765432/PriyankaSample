package SamplePrjct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrmePgm1 {
	
	@Test
	
	private void tc1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		List<WebElement> totalCount = drvr.findElements(By.tagName("iframe"));
		
		int s = totalCount.size();
		System.out.println("Total Frame Count  : " + s);
		
		drvr.switchTo().frame("frm2");
		
		drvr.findElement(By.name("fName")).sendKeys("Besant");
		
		drvr.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		drvr.findElement(By.id("name")).sendKeys("Bye Bye");
		

		
	}

}
