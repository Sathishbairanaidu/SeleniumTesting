package org.test;

import org.Base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass{
	
	@Test (priority = -10)
	private void tc1() {
		launchUrl("https://mail.google.com/"); 
		
	}
	@Test (priority = -3)
	private void tc7() {
		launchUrl("https://inmakeslh.in/login.php");
	}
	@Test (priority = -5)
	private void tc5() {
		launchUrl("https://www.redbus.in/");
	}
	@Test (priority = 5)
	private void tc2() {
		launchUrl("https://www.flipkart.com/");
		
	}
	@Test (priority = 11)
	private void tc6() {
		launchUrl("https://www.amazon.in/");
	}
	@Test(priority = 2)
	private void tc3() {
		launchUrl("https://en-gb.facebook.com/");
	}
	@Test
	private void tc4() {
		launchUrl("https://www.youtube.com/");
	}
	
	@BeforeClass
	private void launchBrowsermethod() {
		launchBrowser();
		windoMaximize();
	}
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("Browser close");

	}
	
}
