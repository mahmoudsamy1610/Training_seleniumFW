package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class HoverTest extends TestBase {

	HomePage homeObject ;
	

	@Test
	public void userCanHover () {
		
		homeObject = new HomePage(driver) ;
		homeObject.SelectNoteBooksMenu();
		
		
		
		

	}
	
	
	
}
