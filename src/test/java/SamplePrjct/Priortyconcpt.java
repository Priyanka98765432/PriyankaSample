package SamplePrjct;

import org.testng.annotations.Test;

public class Priortyconcpt {

	@Test(invocationCount = 3)

	void tc1() {
		System.out.println("TC1");
	}

	@Test(timeOut = 1000)

	void tc2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("TC2");
	}
	

	@Test(dependsOnMethods = "tc2")

	void tc3() {
		System.out.println("TC3");
	}

}
