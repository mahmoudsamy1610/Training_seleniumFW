package Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data.ExcelLoader;
import Pages.HomePage;
import Pages.RegPage;
import junit.framework.Assert;



public class RegTestExcel extends TestBase { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	
	
	@DataProvider(name = "ExcelData")
	public static Object [][] userData () throws IOException

	{
			ExcelLoader EL = new ExcelLoader() ;
			return EL.getExcelData() ;
			
		

	}

	
	
	@Test(priority = 1 ,dataProvider = "ExcelData" ) //
	public void UserRegTest (String FnameEX , String LnameEX , String EmailEX , String PassEX) throws InterruptedException {
		
		 homeObject = new HomePage (driver) ;
		 homeObject.openRegPage();
		 
		 RegObject = new RegPage(driver) ; 
		 RegObject.userREG( FnameEX ,  LnameEX ,  EmailEX ,  PassEX);
		 
			RegObject.StoreResult(RegPage.ResponseMessage);
			Assert.assertTrue(RegObject.RegMessage.contains("Your registration completed"));
			
			RegObject.LogOut();
			

		  }
	

	
	
		
	
	
	
}
