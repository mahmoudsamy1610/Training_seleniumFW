package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;



import Utilities.Helper;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests{
	
	
	public static WebDriver driver ;
	
	@BeforeTest
	@Parameters({"browser"})
	public void StartDriver(@Optional String BrowserName) {
		

		if (BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe") ;
			driver = new ChromeDriver() ;

		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe") ;
			driver = new FirefoxDriver() ;

		}
		
		driver.navigate().to("https://demo.nopcommerce.com") ;
		
		
		
	}
	
		// to take screen shots when failing
		/*@AfterMethod
		public void ScreenShot (ITestResult result) throws IOException {
			
			if (result.getStatus()==ITestResult.FAILURE) 
			{
				System.out.println("Failed") ;
				System.out.println("screanshooooting") ;
				Helper.takeScreenShot(driver, result.getName()) ;
				
				
			}
			
		}*/
	 
		
	
		
}
