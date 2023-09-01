package Grouping;
import org.testng.annotations.Test;
public class groupFirst {
	@Test
	public void BrowserLonchMethod() {
		System.out.println("This is lounching method ");
	}
@Test(groups = {"smoke"})
	public void TestLoginFunc() {
		System.out.println("This is Login Functionality method ");
	}
@Test(groups = {"usability","smoke"})
	public void HomePageTitle() {
		System.out.println("This is Home page Title method ");
	}
@Test(groups = {"usability"}) 

	public void HomePageURL() {
		System.out.println("This is CurrentURl method ");
	}
@Test
	public void CloseBrowser() {
		System.out.println("This is tear Down method ");
	}
@Test (groups = {"Regression"})
public void RegressionMethod () {
	System.out.println("This is Regression method ");
}

}
