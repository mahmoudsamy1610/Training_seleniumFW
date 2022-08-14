package definitions;

import org.testng.Assert;

import Pages.HomePage;
import Pages.RegPage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class UserReg extends TestBase {

	HomePage HomeObject ; 
	RegPage RegObject ; 

@Given("the user should be in the home page")
public void the_user_should_be_in_the_home_page() {
	
	HomeObject = new HomePage(driver);
	HomeObject.openRegPage();
   
}
@When("he clicks on register link")
public void he_clicks_on_register_link() {
    
	Assert.assertTrue(driver.getCurrentUrl().contains("reg"));
	
	
}





@When("he enters user data {string}  {string}  {string}  {string}")
public void he_enters_user_data(String FN, String LN, String Email, String pass) throws InterruptedException {
    
	RegObject = new RegPage(driver) ;
	RegObject.userREG(FN, LN, Email, pass);
	
}


/*@When("he enters user data")
public void he_enters_user_data() throws InterruptedException {
    
	RegObject = new RegPage(driver) ;
	RegObject.userREG("mahmoud", "samy", "samy@gmail.com", "123345456");
	
}*/
@Then("the registeratoin page displayed successfully")
public void the_registeratoin_page_displayed_successfully() {
    
	RegObject = new RegPage(driver) ;
	RegObject.LogOut();
	
}

	
	
}
	