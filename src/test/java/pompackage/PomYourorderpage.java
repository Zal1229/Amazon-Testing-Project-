package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.AmazonBaseClass;

public class PomYourorderpage extends AmazonBaseClass  {

	@FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[1]/span") WebElement YourorderNevigation;
    @FindBy(xpath ="/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2") WebElement Yourorder;
    @FindBy(xpath = "/html/body/div[1]/section/div/div[3]/ul/li[1]") WebElement orders;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[3]/ul/li[2]/span") WebElement Buyagain;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[3]/ul/li[3]/span/a") WebElement NotYetShipped;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[3]/ul/li[4]/span/a") WebElement Cancelledorder;


public PomYourorderpage() {
	 
	 PageFactory.initElements(driver, this);
}

//Method to nevigate on your order .
	public void nevigatetoYourOrder() {
		YourorderNevigation.click();
	}
	
//Method to click on orders
	public void clickonOrders() {
		YourorderNevigation.click();
	}
	
//Method to click on Buyagain
	public void clickonBuyagain() {
		Buyagain.click();
	}
//Method to click on Not Yet Shipped
	public void clickonNotyetshipped() {
		NotYetShipped.click();
	}

//Method to click on cancelled order
	public void clickonCancelledorder() {
		Cancelledorder.click();
	}
}