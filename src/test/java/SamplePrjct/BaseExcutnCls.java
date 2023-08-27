package SamplePrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClsPckage.BasClsPgm1;

public class BaseExcutnCls extends BasClsPgm1 {

	public static void main(String[] args) {
		
		browserLaunch("https://www.facebook.com/");	//Press control and click mouse button it will take you to the method.
		browserMaxmiz();
		
		WebElement user = drvr.findElement(By.id("email"));
		sendValue(user, "Besant Tech");
		
		printUrl();
		printTitle();
		

	}

}
