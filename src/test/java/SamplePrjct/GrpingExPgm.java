package SamplePrjct;

import org.testng.annotations.Test;

public class GrpingExPgm {
	
	@Test(groups="Smoke")
	public void tc1() {
		
		System.out.println("TC 1");
	}
	
	@Test(groups="Sanity")
	public void tc2() {
		
		System.out.println("TC 2");
	}
	
	@Test(groups="Regression")
	public void tc3() {
		
		System.out.println("TC 3");
	}
	

}
