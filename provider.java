package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class provider {
	public WebDriver driver;

	@Test(dataProvider = "containerA")

	public void testcontainer(String username, String password, String datatype) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

		driver.findElement(By.xpath("//button[@name='login']")).click();

//		if (datatype.equals("valid")) {
//			System.out.println(driver.getCurrentUrl());
//
//		} else if (datatype.equals("invalid")) {
//			WebElement e = driver.findElement(By.xpath("//div[@class='_9ay7']"));
//			System.out.println(e.getText());
//		}
//	}
//
//	@DataProvider(name = "containerA")
//
//	public Object[][]container() {
//		return new Object[][] {{ "admin", "admin123", "valid"},{ "abcd", "xYZ", "invalid" },
//			};
//
	}
}
