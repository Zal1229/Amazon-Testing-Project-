package testLayer;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.AmazonBaseClass;
import pompackage.PomCreateAccount;

public class TestCreateAccount extends AmazonBaseClass {

	PomCreateAccount NewAcc; // reference variable of POM of CreateAccount
	Actions action; // reference variable of action class
	
// Create constructor of thid class
	public TestCreateAccount() {	
//  By calling parent constructor,going to read all property of config.property file and accordingly intiate method will work
		super();  //call constructor of parent class
	}
	
	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("CreateAcc");
		
		NewAcc = new PomCreateAccount();
		
	}
	

@Test(priority=1) //Create Account_TC1_Displaying Create Account 

	public void title() {
		String actual = NewAcc.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "https://www.amazon.ca/");}

	
@Test(priority=2) // Create Account_TC2_Valid Your name field 

	public void DisplayingCreateAcc() throws InterruptedException {
	Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName("Yourname");
	NewAcc.TypeMobileorEmail(prop.getProperty("mobileNo"));
	NewAcc.TypePassword(prop.getProperty("Password"));
	NewAcc.TypePasswordagain(prop.getProperty("PasswordAgain"));
	NewAcc.ClickonContinue();
	Thread.sleep(8000);
	String actual = NewAcc.DisplaypzlEmsg();
	System.out.println(actual);
		assertTrue(actual.contains("Solve this puzzle to protect your account"));
		Thread.sleep(2000);
} 
		
@Test (priority = 3)  // Create Account_TC3_Invalid Your name field 

	public void EmptyYourField() throws InterruptedException {
	    Thread.sleep(2000);
		NewAcc.MoveCursertoStartHere();
		NewAcc.ClickonStartHere();
		NewAcc.TypeYourName("");
		NewAcc.TypeMobileorEmail(prop.getProperty("mobileNo"));
		NewAcc.TypePassword(prop.getProperty("Password"));
		NewAcc.TypePasswordagain(prop.getProperty("PasswordAgain"));
		NewAcc.ClickonContinue();
		String actual = NewAcc.DisplaynameError();
		System.out.println(actual);
		assertTrue(actual.contains("Enter your name"));
		Thread.sleep(2000);
	   }

@Test (priority = 4)  //Create Account_TC4_invalid Mobile number or email field

public void EmptyMobileField() throws InterruptedException {
    Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail("");
	NewAcc.TypePassword(prop.getProperty("Password"));
	NewAcc.TypePasswordagain(prop.getProperty("PasswordAgain"));
	NewAcc.ClickonContinue();
	String actual = NewAcc.DisplayemailError();
	System.out.println(actual);
	assertTrue(actual.contains("Enter your e-mail address or mobile phone number"));
	Thread.sleep(2000);

   }
@Test (priority = 4)  //Create Account_TC6_Valid Mobile number or email field

public void getMobileverifybtn() throws InterruptedException {
    Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail("123");
	NewAcc.TypePassword(prop.getProperty("Password"));
	Thread.sleep(2000);
	String actual = NewAcc.getcontinuebutntxt();
	System.out.println(actual);
	assertTrue(actual.contains("Verify mobile number"));
   }

@Test (priority = 5)  //Create Account_TC7_Valid Mobile number or email field


public void getEmailverifybtn() throws InterruptedException {
    Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail("abc");
	NewAcc.TypePassword(prop.getProperty("Password"));
	Thread.sleep(2000);
	String actual = NewAcc.getcontinuebutntxt();
	System.out.println(actual);
	assertTrue(actual.contains("Verify email"));
   }

@Test(priority = 6) // Create Account_TC9_Invalid Password field


public void Invalidpassword() throws InterruptedException {
	Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail(prop.getProperty("mobileNo"));
	NewAcc.TypePassword("pass");
	NewAcc.TypePasswordagain("pass");
	NewAcc.ClickonContinue();	
	String actual = NewAcc.DisplayPassError();
	System.out.println(actual);
	assertTrue(actual.contains("Minimum 6 characters required"));
	Thread.sleep(2000);
	
}

@Test(priority = 7)//Create Account_TC10_Invalid Password field
public void Emptypassword() throws InterruptedException {
	Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail(prop.getProperty("mobileNo"));
	NewAcc.TypePassword("");
	NewAcc.TypePasswordagain("1234567");
	NewAcc.ClickonContinue();	
	Thread.sleep(2000);
	String actual = NewAcc.DisplayPassError();
	System.out.println(actual);
	assertTrue(actual.contains("Minimum 6 characters required"));
	}

@Test(priority = 8)//Create Account_TC13_Invalid Password again field

public void Invalidpasswordagain() throws InterruptedException {
	Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail(prop.getProperty("mobileNo"));
	NewAcc.TypePassword(prop.getProperty("Password"));
	NewAcc.TypePasswordagain("");
	NewAcc.ClickonContinue();	
	Thread.sleep(2000);
	String actual = NewAcc.DisplaypassagainError();
	System.out.println(actual);
	assertTrue(actual.contains("Type your password again"));
	}

@Test(priority = 9)//Create Account_TC14_Invalid Password again field

public void Missmatchedpasswordagain() throws InterruptedException {
	Thread.sleep(2000);
	NewAcc.MoveCursertoStartHere();
	NewAcc.ClickonStartHere();
	NewAcc.TypeYourName(prop.getProperty("Yourname"));
	NewAcc.TypeMobileorEmail(prop.getProperty("mobileNo"));
	NewAcc.TypePassword(prop.getProperty("Password"));
	NewAcc.TypePasswordagain(prop.getProperty("PasswordAgain"));
	NewAcc.ClickonContinue();	
	Thread.sleep(2000);
	String actual = NewAcc.DisplaypassnotmatchError();
	System.out.println(actual);
	assertTrue(actual.contains("Passwords do not match"));
	}

	 
@AfterMethod
public void close() {
	
	driver.close();	
	}
}
	
		

