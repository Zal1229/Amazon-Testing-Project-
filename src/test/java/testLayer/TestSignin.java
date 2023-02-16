package testLayer;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.AmazonBaseClass;
import pompackage.PomSignin;

public class TestSignin extends AmazonBaseClass {

	PomSignin signin;
	
	
	public TestSignin() {
		super();}
	
@BeforeMethod
public void initsetup() {
	initiate();
	screenshots("Signin");
		
	signin = new PomSignin();}

@Test(priority = 1) // checking for dispaly signin button
public void dispaysignin() throws InterruptedException {
	Thread.sleep(2000);
    signin.displaysignin();
	Thread.sleep(2000);
}

@Test(priority = 2) // Sign-In_TC16_Verify Valid Email/Phone number field
public void ValidEmailPhone() throws InterruptedException {
	Thread.sleep(2000);
    signin.MoveCursertoSignin();
    signin.clicksignin();
    signin.typeEmail(prop.getProperty("email"));
    signin.clickoncontinue();
    Thread.sleep(2000);
	String actual = signin.Displaypasspage();
	System.out.println(actual);
	assertTrue(actual.contains("Password"));
}

@Test(priority = 3) // Sign-In_TC18_Verify Invalid Email/Phone number field
public void InvalidEmailPhone() throws InterruptedException {
	Thread.sleep(2000);
    signin.MoveCursertoSignin();
    signin.clicksignin();
    signin.typeEmail("");
    signin.clickoncontinue();
    Thread.sleep(2000);
	String actual = signin.Displayemailerror();
	System.out.println(actual);
	assertTrue(actual.contains("Enter your e-mail address or mobile phone number"));
}
@Test(priority = 4) // Your Account_TC21_Verify Greeting message.

public void KeepMeSignin() throws InterruptedException {
	Thread.sleep(2000);
    signin.MoveCursertoSignin();
    signin.clicksignin();
    signin.typeEmail(prop.getProperty("email"));
    signin.clickoncontinue();
    Thread.sleep(2000);
    signin.typepassword(prop.getProperty("Password"));
    signin.clickcheckbox();
    Thread.sleep(2000);
    signin.clickonSignin();  
	String actual = signin.DisplayHelloSignin();
	System.out.println(actual);
	assertTrue(actual.contains("Hello, Zalak"));
	initiate();
}
@Test(priority = 5) // Sign-In_TC18_Verify Invalid Email/Phone number field
public void KeepMeSigninagain() throws InterruptedException {
   
	String actual = signin.DisplayHelloSignin();
	System.out.println(actual);
	assertTrue(actual.contains("Hello, sign in"));
	
}

@Test(priority = 6) // Sign-In_TC18_Verify Invalid Email/Phone number field
public void viewAccInfo() throws InterruptedException {
	Thread.sleep(2000);
    signin.MoveCursertoSignin();
    signin.clicksignin();
    signin.typeEmail(prop.getProperty("email"));
    signin.clickoncontinue();
    Thread.sleep(2000);
    signin.typepassword(prop.getProperty("Password"));
    signin.clickonSignin();
    signin.MoveCursertoAccountList();
	String actual = signin.DisplayYrAccinfo();
	System.out.println(actual);
	assertTrue(actual.contains("Your Account"));
	initiate();
}

	 
@AfterMethod
public void close() {
	
	driver.close();	}
	
	
}
