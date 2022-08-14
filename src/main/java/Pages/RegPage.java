package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.gson.JsonElement;

// if we are going to inheret a class has consturctor we should have constructor in the child too


public class RegPage extends PageBase {
	public String RegMessage ;

	// constructor
	public RegPage(WebDriver driver) {
		super(driver);
		//super here exists as calling the super class in order not to rewrite all attributes again [only if we are not using all attributes of the super class] which is not the case

	}

	@FindBy(id ="gender-male") 
	WebElement genderBTN ;

	@FindBy(id ="FirstName") 
	WebElement FNTxtBox ;

	@FindBy(id ="LastName") 
	WebElement LNTxtBox ;

	@FindBy(id ="Email") 
	WebElement emailTxtBox ;

	@FindBy(id ="Password") 
	WebElement PASSTxtBox ;

	@FindBy(id ="ConfirmPassword") 
	WebElement ConfirmPasswordTxtBox ;

	@FindBy(id ="register-button") 
	WebElement RegBTN ; 

	@FindBy(css  = "div.result") 
	public  static
	WebElement ResponseMessage ; 
	
	@FindBy(css="a.ico-logout") 
	public  static
	WebElement LogOutBTN ; 


	public void userREG (String FN ,String LN , String Email , String Password  ) throws InterruptedException {

		clickBTN(genderBTN); 
		WriteText(FNTxtBox, FN);
		WriteText(LNTxtBox, LN);
		WriteText(emailTxtBox, Email);	
		WriteText(PASSTxtBox, Password);
		WriteText(ConfirmPasswordTxtBox, Password);
		clickBTN(RegBTN); 
		Thread.sleep(1000);
		
	


	}
	
	// for Json only
	/*public void userREGJSON (JsonElement FN ,JsonElement LN , JsonElement Email , JsonElement Password  ) throws InterruptedException {

		clickBTN(genderBTN); 
		WriteText1(FNTxtBox,FN);
		WriteText1(LNTxtBox, LN);
		WriteText1(emailTxtBox, Email);	
		WriteText1(PASSTxtBox, Password);
		WriteText1(ConfirmPasswordTxtBox, Password);
		clickBTN(RegBTN); 
		Thread.sleep(1000);
		
	


	}  */
	
	
	
	
/*
	private void WriteTex(WebElement fNTxtBox2, JsonElement fN) {
		// TODO Auto-generated method stub
		
	}
*/




	public String StoreResult (WebElement Message ) {

		RegMessage  = Message.getText() ;
		System.out.println(RegMessage);
		return RegMessage ;
		

	}
	
	public void LogOut( ) {
		
		clickBTN(LogOutBTN);

	}


}
