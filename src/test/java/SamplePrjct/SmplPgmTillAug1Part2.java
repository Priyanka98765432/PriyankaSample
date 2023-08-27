package SamplePrjct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmplPgmTillAug1Part2 {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver Methods and WebElement Methods
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://adactinhotelapp.com/Register.php");
		drvr.manage().window().maximize();
		
		//To Print page title
		String title = drvr.getTitle();
		System.out.println(title);
				
		//To print the current URL
		String currentUrl = drvr.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement gtTxt = drvr.findElement(By.id("username"));
		String text = gtTxt.getText();
		System.out.println(text);
		
		//FindElements
		List<WebElement> allLinks = drvr.findElements(By.tagName("a"));
		int size = allLinks.size();
		System.out.println(size);
		
		//Get Attribute Value
		WebElement email = drvr.findElement(By.id("email_add"));
		email.sendKeys("priyanka@gmail.com");
		String attribute = email.getAttribute("value");	
		System.out.println(attribute);
		
		Thread.sleep(5000);
				
		//Navigation
		drvr.navigate().to("https://www.google.com/");
		
		//Quit Method
		drvr.quit();
		
			

	}

}
