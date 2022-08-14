package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
	
	
	
	//contructor 
	public LoginPage (WebDriver driver) {
		
		super(driver) ;
		
	} 
	
	public static String LoginMessage ; 
	
	@FindBy (id = "Email")
	WebElement EmailTxt; 
	
	@FindBy (id = "Password") 
	WebElement PassTxt ;
	
	@FindBy (id = "RememberMe") 
	WebElement RememberCheck;
	
	@FindBy (css   = "button.button-1.login-button") 
	WebElement LoginBTN;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
	public static 
	WebElement LoginResult ; 

 public void UserLogin (String Email , String Password) {
	 
	 WriteText(EmailTxt, Email);
	 WriteText(PassTxt, Password);
	 clickBTN(RememberCheck);
	 clickBTN(LoginBTN);
 }
 
 public String StoreLoginResult (WebElement Message ) {

		LoginMessage  = Message.getText() ;
		System.out.println(LoginMessage);
		return LoginMessage ;

	}

 
 
 }