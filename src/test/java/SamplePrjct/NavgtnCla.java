package SamplePrjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavgtnCla {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://adactinhotelapp.com/Register.php");
		drvr.manage().window().maximize();
		
		//Navigation
		drvr.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		//Back
		drvr.navigate().back();
		Thread.sleep(2000);
		
		//forward
		drvr.navigate().forward();
		Thread.sleep(2000);
		
		//refresh
		drvr.navigate().refresh();
	}

}
