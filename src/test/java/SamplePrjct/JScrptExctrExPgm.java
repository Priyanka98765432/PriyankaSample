package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JScrptExctrExPgm {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://adactinhotelapp.com/");
		drvr.manage().window().maximize();
		
		WebElement user = drvr.findElement(By.id("username"));
		WebElement pwd = drvr.findElement(By.id("password"));
		WebElement lgnBtn = drvr.findElement(By.id("login"));
		
		JavascriptExecutor js = (JavascriptExecutor)drvr;
		js.executeScript("arguments[0].setAttribute('value', 'PriyankaKasoju')", user);
			
		js.executeScript("arguments[0].setAttribute('value', 'SeleniumTesting')", pwd);
		js.executeScript("arguments[0].click()", lgnBtn);
		
		

	}

}
