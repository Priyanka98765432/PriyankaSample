package AdactinPrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBasClas {
	
	public static WebDriver drvr;
	
	@Test
	
	public static void tstcase1() {
		
		WebDriverManager.chromedriver().setup();
		drvr = new ChromeDriver();
		drvr.get("https://adactinhotelapp.com/");
		drvr.manage().window().maximize();
		
		drvr.findElement(By.id("username")).sendKeys("PriyankaKasoju");
		drvr.findElement(By.id("password")).sendKeys("SeleniumTesting");
		drvr.findElement(By.id("login")).click();
		
	}
	
	public static void tstcase2() {
		
		WebElement SamplTxt = drvr.findElement(By.xpath("//*[text()='Search Hotel ']"));
		String Txt = SamplTxt.getText();
		System.out.println(Txt);
		
		WebElement locatn = drvr.findElement(By.id("location"));
		Select s = new Select(locatn);
		s.selectByVisibleText("London");
		
		WebElement hotls = drvr.findElement(By.id("hotels"));
		Select s2 = new Select(hotls);
		s2.selectByValue("Hotel Sunshine");
		
		WebElement roomtyp = drvr.findElement(By.id("room_type"));
		Select s3 = new Select(roomtyp);
		s3.selectByValue("Standard");
		
		WebElement numofrooms = drvr.findElement(By.id("room_nos"));
		Select s4 = new Select(numofrooms);
		s4.selectByValue("2");
		
		WebElement adults = drvr.findElement(By.id("adult_room"));
		Select s5 = new Select(adults);
		s5.selectByValue("2");
		
		WebElement children = drvr.findElement(By.id("child_room"));
		Select s6 = new Select(children);
		s6.selectByVisibleText("2 - Two");
		
		drvr.findElement(By.name("Submit")).click();
		
	}
	
	public static void tstcase3() {
		
		WebElement SamplTxt2 = drvr.findElement(By.xpath("//*[text()='Select Hotel ']"));
		String Txt2 = SamplTxt2.getText();
		System.out.println(Txt2);
		
		drvr.findElement(By.id("radiobutton_0")).click();
		drvr.findElement(By.id("continue")).click();
		
	}
	
	public static void tstcase4() throws InterruptedException {
		
		WebElement sampltxt3 = drvr.findElement(By.xpath("//*[text()='Book A Hotel ']"));
		String txt3 = sampltxt3.getText();
		System.out.println(txt3);
		
		drvr.findElement(By.id("first_name")).sendKeys("Priyanka");
		drvr.findElement(By.id("last_name")).sendKeys("Kasoju");
		drvr.findElement(By.id("address")).sendKeys("Bengaluru");
		
		WebElement ccnumtxt = drvr.findElement(By.xpath("//*[text()='Use 16 digit Dummy Data']"));
		String txt4 = ccnumtxt.getText();
		System.out.println(txt4);
		
		drvr.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		
		WebElement cardtype = drvr.findElement(By.id("cc_type"));
		Select s7 = new Select(cardtype);
		s7.selectByValue("MAST");
		
		WebElement exprmnth = drvr.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(exprmnth);
		s8.selectByValue("8");
		
		WebElement expryear = drvr.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(expryear);
		s9.selectByVisibleText("2026");
		
		drvr.findElement(By.id("cc_cvv")).sendKeys("123");	
		drvr.findElement(By.id("book_now")).click();
		
		WebElement sampltxt5 = drvr.findElement(By.xpath("//*[text()='Please wait! We are processing your Hotel Booking...']"));
		String t = sampltxt5.getText();
		System.out.println(t);
		
		Thread.sleep(10000);
		
	}
	
	public static void tstcase5() {
		
		String ordrnum = drvr.findElement(By.id("order_no")).getAttribute("value").toString();
		System.out.println(ordrnum);
		drvr.findElement(By.id("logout")).click();
	}
	
	
	
}
