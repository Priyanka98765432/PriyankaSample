package SamplePrjct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmaznTask {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.amazon.in/");
		drvr.manage().window().maximize();
		
		drvr.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		drvr.findElement(By.xpath("//*[text()='67,990']")).click();
		
		drvr.findElement(By.name("//*[@name='submit.add-to-cart']")).click();
		

	}

}
