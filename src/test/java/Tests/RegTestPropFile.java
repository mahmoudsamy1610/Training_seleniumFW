package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data.LoadData;
import Pages.HomePage;
import Pages.RegPage;
import junit.framework.Assert;
import java.util.Properties;

import org.apache.commons.digester.plugins.strategies.LoaderSetProperties;


public class RegTestPropFile extends TestBase { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	String Fn = LoadData.userData.getProperty("FN") ;
	String ln = LoadData.userData.getProperty("LN") ;
	String email = LoadData.userData.getProperty("Email") ;
	String password = LoadData.userData.getProperty("Pass") ;

	
	@Test(priority = 1 ) 
	public void UserRegTest () throws InterruptedException {
		
		 homeObject = new HomePage (driver) ;
		 homeObject.openRegPage();
		 
		 RegObject = new RegPage(driver) ; 
		 RegObject.userREG( Fn ,  ln ,  email ,  password);
		 
			RegObject.StoreResult(RegPage.ResponseMessage);
			Assert.assertTrue(RegObject.RegMessage.contains("Your registration completed"));
			
			RegObject.LogOut();
			

		  }
	

	
	
		
	
	
	
}
