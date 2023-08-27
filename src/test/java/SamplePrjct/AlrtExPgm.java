package SamplePrjct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlrtExPgm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
				
		drvr.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(2000);
		Alert a = drvr.switchTo().alert();
		a.accept();
				
		Thread.sleep(3000);
		drvr.quit();

	}

}
