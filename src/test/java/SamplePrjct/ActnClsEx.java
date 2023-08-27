package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActnClsEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://demo.guru99.com/test/simple_context_menu.html");
		drvr.manage().window().maximize();
		
		//Action Class Methods Context Click and Double Click
		WebElement rtClk = drvr.findElement(By.xpath("//*[text()='right click me']"));
		Actions a = new Actions(drvr);
		
		a.moveToElement(rtClk).perform();
		a.contextClick().perform();
		Thread.sleep(3000);
		
		WebElement dblClk = drvr.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		a.doubleClick(dblClk);
		
		
		

	}

}
