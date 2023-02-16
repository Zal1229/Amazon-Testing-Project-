package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.AmazonBaseClass;

public class PomCreateAccount extends AmazonBaseClass {
	
	Actions action;
	
	// Object Repository of Create Account Page
	@FindBy(xpath = "//*[@id=\"nav-signin-tooltip\"]/div/a") WebElement startHere;
	@FindBy(id = "ap_customer_name") WebElement YourName;  //driver.findElemt(By.
	@FindBy(id = "ap_email") WebElement MobileorEmail;
	@FindBy(id = "ap_password") WebElement Password;
    @FindBy(id ="ap_password_check") WebElement PasswordAgain;
    @FindBy(id = "continue") WebElement Continuebtn;
    @FindBy(id = "home_children_button") WebElement GetPuzzle;
    @FindBy(id = "auth-continue-announce") WebElement VerifyMobile;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[1]/div[2]/div") WebElement passworderror;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[2]/div[3]/div/div") WebElement Emailmobileerror;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[1]/div/div/div") WebElement yournameerror;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[1]") WebElement Puzzlemsg;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[2]/div[1]/div/div") WebElement passwordagainerrormsg;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[2]/div[2]/div") WebElement passwordnotmatchmsg;
    
    // Initiate page elements // Create constructor of this class
     public PomCreateAccount() {
    	
    //initElement is a static mathod which is used to initialize all the elements specified by @Findby anotation 
    	
    PageFactory.initElements(driver, this);
    
    action = new Actions(driver);}
    
    
   // Mothods which we are going to use for this page
    //Method to errormsg for password again
    public String DisplaypassnotmatchError() {
    	PasswordAgain.click();
    	boolean a = passwordnotmatchmsg.isDisplayed();
    	String b =passwordnotmatchmsg.getText();
    	System.out.println(a);
		return b;}
    
    //Method to errormsg for password again
    public String DisplaypassagainError() {
    	PasswordAgain.click();
    	boolean a = passwordagainerrormsg.isDisplayed();
    	String b =passwordagainerrormsg.getText();
    	System.out.println(a);
		return b;}
    
    
    //Get puzzle msg Displaying
    public String DisplaypzlEmsg() {
    	boolean a = Puzzlemsg.isDisplayed();
    	String b =Puzzlemsg.getText();
    	System.out.println(a);
		return b;}
    
    
    //Get yourname Error Displaying
    public String DisplaynameError() {
    	boolean a = yournameerror.isDisplayed();
    	String b =yournameerror.getText();
    	System.out.println(a);
		return b;}
    
    
    
    //Get Email Error Displaying
    public String DisplayemailError() {
    	boolean a = Emailmobileerror.isDisplayed();
    	String b =Emailmobileerror.getText();
    	System.out.println(a);
		return b;}
    
    
    //Get Password error dispaying
    public String DisplayPassError() {
    	Password.click();
    	boolean a = passworderror.isDisplayed();
    	String b =passworderror.getText();
    	System.out.println(a);
		return b;}  
    
    
   // Get Mobile/Email verify button text 
    public String getcontinuebutntxt() {
    	String text = VerifyMobile.getText();
		return text;}
    
   //Mousehover to start here option
    public void MoveCursertoStartHere() {
    	action.moveToElement(startHere);}
    
   //Method to nevigate to create account page.
    public void ClickonStartHere() {
    	startHere.click();}
    
   //Method to type "Your name" field.
    public void TypeYourName(String name) {
    	YourName.sendKeys(name);}
    
  //Method to type "Mobile number or email" field.
    public void TypeMobileorEmail(String email ){
    	MobileorEmail.sendKeys(email);}
 
  //Method to type "Password" field.
    public void TypePassword(String password ){
    	Password.sendKeys(password);}
    
   //Method to type "Password again" field.
    public void TypePasswordagain(String passwordagain ){
    	PasswordAgain.sendKeys(passwordagain);}
    	
   //Method to click on "continue" button.
   public void ClickonContinue() {
	   Continuebtn.click();  }
	   
   
   //Method to verify title.
   public String verify() {
	   return driver.getCurrentUrl(); }

 }



    
    

