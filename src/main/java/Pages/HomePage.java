package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

// if we are going to inheret a class has consturctor we should have constructor in the child too


public class HomePage extends PageBase {
	

	// constructosr
	public HomePage(WebDriver driver) {
		super(driver);
		
		action = new Actions(driver) ;

	
     //super here exists as calling the super class in order not to rewrite all attributes again [only if we are not using all attributes of the super class] which is not the case
	// here you have to create consturctor as this class is exteneded
	
		
	
	}
	
	
	@FindBy(className ="ico-register") 
	WebElement RegLink ;
	
	@FindBy(className ="ico-login") 
	WebElement LoginLink ;
	
	@FindBy(linkText = "Computers")
	WebElement ComputerMenu ;
	
	@FindBy(linkText = "Notebooks" )
	WebElement NoteBooksMenu ;
	
	
	
	
	public void openRegPage () {
		clickBTN(RegLink);
	}
	
	public void openLoginPage () {
		clickBTN(LoginLink);
	}
	
	
	public void SelectNoteBooksMenu () {

		Hover(ComputerMenu);
		Hover(NoteBooksMenu);
		clickBTN(NoteBooksMenu);
		
	}
	
	
}
