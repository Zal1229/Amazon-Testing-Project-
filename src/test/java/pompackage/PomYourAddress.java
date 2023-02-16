package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.AmazonBaseClass;

public class PomYourAddress  extends AmazonBaseClass{
	
	@FindBy(xpath = " W/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[1]/span") WebElement YourAccount;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") WebElement YourAddress;
    @FindBy(id = "ya-myab-plus-address-icon") WebElement AddAddress;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/form/span/div/div[1]/div/div[2]/span/span/span/span") WebElement CountryRegion;
    @FindBy(id = "address-ui-widgets-enterAddressFullName") WebElement FullName;
    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber") WebElement PhoneNo;
    @FindBy(id = "address-ui-widgets-enterAddressLine1") WebElement Address1;
    @FindBy(id = "address-ui-widgets-enterAddressLine2") WebElement Address2;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/form/span/div/div[1]/div/div[14]/span/span/span/span") WebElement Provience;
    @FindBy(id = "address-ui-widgets-enterAddressPostalCode") WebElement Postalcode;
    @FindBy(id = "address-ui-widgets-use-as-my-default") WebElement DefaultChkBox;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/form/span/div/div[4]/a/span/span") WebElement DeliveryInstruction;
    @FindBy(id = "address-ui-widgets-form-submit-button-announce") WebElement AddAddressBtn;
    
    
    public PomYourAddress() {
   	 
   	 PageFactory.initElements(driver, this);
   }
    
   // Methods
}
