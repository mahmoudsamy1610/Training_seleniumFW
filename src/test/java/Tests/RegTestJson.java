package Tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;

import Data.JsonDataLoader;
//import Data.JsonDataReader;
import Pages.HomePage;
import Pages.RegPage;
import junit.framework.Assert;

public class RegTestJson extends TestBase { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	
	
	
	
	
	@Test(priority = 1 ) 
	public void UserRegTest () throws InterruptedException, FileNotFoundException, IOException, ParseException {
		
		
		
		JsonDataLoader reader = new JsonDataLoader() ;
		reader.JsonDataReader();
		
		 homeObject = new HomePage (driver) ;
		 homeObject.openRegPage();
		 
		 RegObject = new RegPage(driver) ; 
		// RegObject.userREGJSON( reader.FN ,  reader.LN , reader.Email , reader.PASS);
		 
			//RegObject.StoreResult(RegPage.ResponseMessage);
			//Assert.assertTrue(RegObject.RegMessage.contains("Your registration completed"));
			
			RegObject.LogOut();
			

		  }
	

	
	
		
	
	
	
}
