package SamplePrjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCls {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.facebook.com/");
		drvr.manage().window().maximize();
		drvr.quit();
	}

}
