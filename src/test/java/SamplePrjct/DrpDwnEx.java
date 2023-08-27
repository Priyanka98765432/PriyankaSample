package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDwnEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.facebook.com/");
		drvr.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		drvr.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		WebElement mnth = drvr.findElement(By.id("day"));
		Select s = new Select(mnth);
		s.selectByVisibleText("11");
		

	}

}
