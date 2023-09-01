package Grouping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GroupSecond {
	
	@Test
	public void Withdraw(){
		System.out.println("Withdraw Method Runnnnnn...5");
	}
	@Test(groups= {"Smoke"})
	public void Dispaly(){
		System.out.println("Dispaly Method Runnnnnn...2");
	}
	@Test(groups = {"Smoke"})
	public void Show(){
		System.out.println("Show Method Runnnnnn...4");
	}
	@Test(groups= {"Regression"})
	public void Remove(){
		System.out.println("Remove Method Runnnnnn...3");
	}
	@Test
	public void Cancle(){
		System.out.println("Canlce Method Runnnnnn...1");
	}
	
	

}
