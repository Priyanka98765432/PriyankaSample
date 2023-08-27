package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrgndDrpMthds {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://demoqa.com/droppable");
		drvr.manage().window().maximize();
		
		//Action Class Methods Drag and Drop
		WebElement drgElemt = drvr.findElement(By.xpath("//*[text()='Drag me']"));
		WebElement drpElemt = drvr.findElement(By.xpath("//*[text()='Drop here']"));
		
		Actions a =new Actions(drvr);
		a.dragAndDrop(drgElemt, drpElemt).perform();
		Thread.sleep(3000);
		

	}

}
