package BaseClsPckage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasClsPgm1 {
	public static WebDriver drvr;

	//Browser Launch
	public static void browserLaunch(String url) {

		WebDriverManager.chromedriver().setup();
		drvr = new ChromeDriver();
		drvr.get(url);
		
	}	
	
	//MAximize
	public static void browserMaxmiz() {
		
		drvr.manage().window().maximize();
	}
	
	//Send Keys
	public static void sendValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}
	
	//Print URL
	public static void printUrl() {
		System.out.println(drvr.getCurrentUrl());
	}
	
	//Print Title
	public static void printTitle() {
		System.out.println(drvr.getTitle());
	}

}
