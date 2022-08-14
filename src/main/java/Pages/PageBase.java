package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


	
	
	public class PageBase {
		
		
		protected  WebDriver driver ;
		public static Actions action ;
		
		
		//constructor
		// the driver here is the constructor parameter only for passing
		public PageBase (WebDriver driver) {
			
			PageFactory.initElements(driver, this) ; // this is the pageobject
				
			action = new Actions(driver) ;
	
		}
		
		public static void clickBTN (WebElement button) {
			
		button.click();
			
		}

		public static void WriteText(WebElement textElement, String TextValue) {
			
		textElement.sendKeys(TextValue) ;
		}
				
		public static void Hover (WebElement HovingElement) {
			
			action.moveToElement(HovingElement).click().build().perform();
			
			
		}
		

		/* for Json
		public static void WriteTextJSON (WebElement textElement, CharSequence[] TextValue) {
			
		textElement.sendKeys(TextValue);
		
		
		} */
	}


