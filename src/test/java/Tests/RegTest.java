package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegPage;
import junit.framework.Assert;

public class RegTest extends TestBase { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	
	

	
	
	@Test(priority = 1)
	public void UserRegTest () throws InterruptedException {
		
		 homeObject = new HomePage (driver) ;
		 homeObject.openRegPage();
		 
		 RegObject = new RegPage(driver) ; 
		 RegObject.userREG("mahmoud", "samy", "mahmoud14822@gmail.com", "12345678");
		

		 
		  }
	

	@Test(priority = 2)
	public void Result () {
	
		RegObject = new RegPage(driver) ; 
		RegObject.StoreResult(RegPage.ResponseMessage);
		Assert.assertTrue(RegObject.RegMessage.contains("Your registration completed"));
		
		
	}
	
		
	
	
	
}
