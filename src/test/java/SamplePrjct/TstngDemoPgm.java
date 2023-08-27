package SamplePrjct;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TstngDemoPgm {

	
	@BeforeClass
	void beforeClass(){
		System.out.println("Before Class");	
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Before Method");
		
	}
	
	@Test
	
	void tstCseMethd1(){
		
		System.out.println("Hello World first TestNG Progam");
	}
	
	@AfterMethod() 
		void afterMethod() {
		System.out.println("After Method");
			
		}
	
	@AfterClass
	void afterClass() {
		System.out.println("After Class");
	}
		
	}


