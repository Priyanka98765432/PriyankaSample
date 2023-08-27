package SamplePrjct;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WndwsHndlngPgm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		drvr.manage().window().maximize();
		
		Set<String> parentWndowId = drvr.getWindowHandles();
		System.out.println(parentWndowId);
		
		drvr.findElement(By.id("newWindowBtn")).click();
		drvr.manage().window().maximize();
		
		Thread.sleep(3000);
		Set<String> allWndowsId = drvr.getWindowHandles();
		System.out.println(allWndowsId);
		
		for(String allWndows : allWndowsId) {
			
			if(!allWndowsId.equals(parentWndowId)) {
				
				drvr.switchTo().window(allWndows);
				
				drvr.findElement(By.name("fName")).sendKeys("Beasnt Technologies");
				
				Thread.sleep(5000);
				//drvr.close();
				
				
			}
		}

	}

}
