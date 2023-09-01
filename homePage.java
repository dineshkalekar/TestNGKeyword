package Grouping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homePage {
	
	WebDriver driver;
	@Test
	public void test1()
	{
		System.out.println("abc");
	}
	@BeforeMethod
	public void test2()
	{
		System.out.println("xyz");
	}

	
}
