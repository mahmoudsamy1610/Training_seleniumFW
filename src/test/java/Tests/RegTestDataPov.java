package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegPage;
import junit.framework.Assert;

public class RegTestDataPov extends TestBase { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	
	
	@DataProvider(name="testData")
	public static Object [][] userData ()

	{
		String[][]dataArr = new String [][]
												{
			{"mahmoud" , "samy" , "mahmoud124453123@gmail.com" , "1234567"} 
			,{"hoda" , "smsm" , "smsm12323123@gmail.com" , "555555555"}
		};	
			
		return  dataArr ;
		

	}

	
	
	@Test(priority = 1 ,dataProvider = "testData" ) //
	public void UserRegTest (String FN , String LN , String Email , String Pass) throws InterruptedException {
		
		 homeObject = new HomePage (driver) ;
		 homeObject.openRegPage();
		 
		 RegObject = new RegPage(driver) ; 
		 RegObject.userREG( FN ,  LN ,  Email ,  Pass);
		 
			RegObject.StoreResult(RegPage.ResponseMessage);
			Assert.assertTrue(RegObject.RegMessage.contains("Your registration completed"));
			
			RegObject.LogOut();
			

		  }
	

	
	
		
	
	
	
}
