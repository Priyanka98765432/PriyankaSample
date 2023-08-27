package SamplePrjct;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakScreenShtExPgm {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drvr = new ChromeDriver();
		drvr.get("https://adactinhotelapp.com/");
		
		TakesScreenshot ts = (TakesScreenshot)drvr;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\priyanka_scan_docs\\Adactnpgscrnsht.jpeg");
		
		FileUtils.copyFile(src, destination);
		
		

	}

}
