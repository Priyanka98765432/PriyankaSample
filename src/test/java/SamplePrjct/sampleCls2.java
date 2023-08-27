package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleCls2 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.amazon.in//");
		drvr.manage().window().maximize();
		
		WebElement baby = drvr.findElement(By.xpath("//*[text()='Baby']"));
		
		Actions a = new Actions(drvr);
		
		a.moveToElement(baby);
		
		
		
		
	}

}
