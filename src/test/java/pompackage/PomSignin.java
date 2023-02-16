package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.AmazonBaseClass;

public class PomSignin extends AmazonBaseClass{
	
	Actions action;

	// Object Repository of Sign In Page
	 @FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[13]/div[2]/a/span") WebElement Signin;
	 @FindBy(id = "ap_email") WebElement Email;
	 @FindBy(id = "continue") WebElement Continuebtn;
	 @FindBy(id = "ap_password") WebElement password;
	 @FindBy(id = "signInSubmit") WebElement signinbtn;
	 @FindBy(name = "rememberMe")WebElement KeepMeSignedCheckbox;
	 @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/div[1]/div[1]/label") WebElement askforpass;
	 @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/div/div/div") WebElement enteremailerror;
	 @FindBy(id = "nav-link-accountList-nav-line-1") WebElement hellosignin;
	 @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/h1") WebElement YrAccinfo;
	 @FindBy(id = "yqjv1s-anok45-ts0ob1-m67azk") WebElement AccountList;
	
	 public PomSignin() {
		 
		 PageFactory.initElements(driver, this);    
		    
		 action = new Actions(driver);
		 
	 }
	// Mothods which we are going to use for this page
	//Method to verify title.
	  
	//Mousehover to mousehover to signin option
		 public void MoveCursertoAccountList() {
		    action.moveToElement(AccountList);
		    AccountList.click();}
		 
		//Display Your account info
		 public String DisplayYrAccinfo() {
		    	boolean a = YrAccinfo.isDisplayed();
		    	String b =YrAccinfo.getText();
		    	System.out.println(a);
				return b;}
	 
	 //Display helloe signin
	 public String DisplayHelloSignin() {
	    	boolean a = hellosignin.isDisplayed();
	    	String b =hellosignin.getText();
	    	System.out.println(a);
			return b;}
	 
	
	 
	 //Display email error
	    public String Displayemailerror() {
	    	boolean a = enteremailerror.isDisplayed();
	    	String b =enteremailerror.getText();
	    	System.out.println(a);
			return b;}
	 
	 //Asking for password page displaying after entering email
	    public String Displaypasspage() {
	    	boolean a = askforpass.isDisplayed();
	    	String b =askforpass.getText();
	    	System.out.println(a);
			return b;}
	 
	 
	//Method to display signin button
	 public void displaysignin() {
	   boolean a = Signin.isDisplayed();
 	   System.out.println(a);
	  }
	 
	//Mousehover to mousehover to signin option
	 public void MoveCursertoSignin() {
	    action.moveToElement(Signin);}
	 
	 
	//Method to click on signin page
	public void clicksignin() {
		Signin.click();
	}

		    
    //Method to type "EmailorMobile" field.
    public void typeEmail( String email){
		Email.sendKeys(email);}
	
	//Method to click on continue button.
	public void clickoncontinue() {
		Continuebtn.click();}
	
	//Method to click on Signin button.
	public void clickonSignin() {
		signinbtn.click();}
	
	//Method to type "Password" field.
    public void typepassword( String pass){
		password.sendKeys(pass);}
		
	//Method to click on checkbox keep me signed
	public void clickcheckbox() {
		KeepMeSignedCheckbox.click();}
	
	 }

