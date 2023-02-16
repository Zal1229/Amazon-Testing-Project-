package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.AmazonBaseClass;

public class PomSearch extends AmazonBaseClass {
	
	@FindBy(id = "twotabsearchtextbox") WebElement SearchTxtBox;
	@FindBy(id = "nav-search-submit-button") WebElement SearchBtn;
	
	
	 public PomSearch() {
	   	 
	   	 PageFactory.initElements(driver, this);
	   }
	

}
