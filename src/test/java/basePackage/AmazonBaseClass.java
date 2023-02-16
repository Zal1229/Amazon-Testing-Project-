package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class AmazonBaseClass {
	
	
	public static Properties prop =  new Properties();   // object created for properties class to read properties of Config, propertirs file
	public static WebDriver driver;                      // reference variable declaration of webdriver
  
	
//Step 1 : constructor created for this class => code to read properties from config.properies file
	
	public AmazonBaseClass() {
		
		try {  
	FileInputStream file = new FileInputStream("D:\\Software Testing\\Eclips IDE\\Amazon_Ecommerce_website\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);
		}
		
		catch(FileNotFoundException e){
	e.printStackTrace();	
		}
		
		catch(IOException a) {
	a.printStackTrace();
		}
		}
	
	
	
// Step 2: All common commands used by child classes.	
	
	@SuppressWarnings("deprecation")
	public static void  initiate() {
		
	String browsername = prop.getProperty("browser");
	
	if (browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
	} 
	else if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	driver.manage().window().maximize();    // to maximize window
	driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);  // page load time out
	driver.get(prop.getProperty("url"));   
		
	}
	
	
	public static void screenshots(String filename) {
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try {
		FileUtils.copyFile(file, new File("D:\\Software Testing\\Eclips IDE\\Amazon_Ecommerce_website\\src\\test\\java\\screenshot\\Screenshots" + filename +".jpg"  ));
	}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
 	