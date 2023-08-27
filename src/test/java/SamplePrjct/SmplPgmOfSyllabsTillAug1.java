package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmplPgmOfSyllabsTillAug1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://adactinhotelapp.com/Register.php");
		drvr.manage().window().maximize();
		
	
		//Locator and its types
		
		WebElement user = drvr.findElement(By.id("username"));
		user.sendKeys("Besant Technologies");
		WebElement fullName = drvr.findElement(By.name("full_name"));
		fullName.sendKeys("Besant Technologies");
		
		//Xpath Using Index
		
		WebElement passwrd = drvr.findElement(By.xpath("(//input[@type='password'])[1]"));
		passwrd.sendKeys("ABCDFEGH");
		WebElement repasswrd = drvr.findElement(By.xpath("(//input[@type='password'])[2]"));
		repasswrd.sendKeys("ABCDFEGH");
		
		Thread.sleep(10000);
		
		//Xpath using Attribute
		WebElement chkbox = drvr.findElement(By.xpath("//input[@type='checkbox']"));
		chkbox.click();
		
		//Xpath using Text
		WebElement samplText = drvr.findElement(By.xpath("//span[text()='(Fields marked with Red asterix (*) are mandatory)']"));
		String text = samplText.getText();
		System.out.println(text);
		
		//Xpath using contains keyword
		WebElement cntns = drvr.findElement(By.xpath("//span[contains(text(),'(Fields marked with')]"));
		String txt = cntns.getText();
		System.out.println(txt);
		
		//LinkText
		WebElement link = drvr.findElement(By.linkText("Go back to Login page"));
		link.click();
		
		//Partial LinkText
		WebElement partlLink = drvr.findElement(By.partialLinkText("Go back to"));
		partlLink.click();
		
		

	}

}
