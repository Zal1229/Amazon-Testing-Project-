package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.AmazonBaseClass;

public class PomShoppingcart extends AmazonBaseClass {
	
	@FindBy(id = "nav-cart-text-container") WebElement cart;
	@FindBy(id = "sc-buy-box-ptc-button-announce") WebElement CheckoutBtn;
	
 public PomShoppingcart() {
	   	 
	   	 PageFactory.initElements(driver, this);
	   }
 
 //Methods
	

}
