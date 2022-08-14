package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import Pages.HomePage;
import Pages.RegPage;
import junit.framework.Assert;

public class RegTestCSV extends TestBase { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	
	
CSVReader reader ;

	
	
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
