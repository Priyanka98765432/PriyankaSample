package SamplePrjct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FndElmntsLstPgm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://www.google.com/");
		
		drvr.findElement(By.name("q")).sendKeys("che");
		
		Thread.sleep(3000);
		
		List<WebElement> autoSuggstn = drvr.findElements(By.xpath("//*[@class='ClJ9Yb']"));
		
		int sze = autoSuggstn.size();
		
		System.out.println(sze);
		
		autoSuggstn.get(sze-6).click();

	}

}
