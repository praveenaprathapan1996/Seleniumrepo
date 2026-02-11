package automationCore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import utilities.ScreenshotUtility;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	
	public void intializeBrowser() throws Exception
	{ 
			
		 driver =new ChromeDriver();
		
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
	}
@AfterMethod
	public void driverQuit(ITestResult iTestResult) throws IOException { 
		  
 		if (iTestResult.getStatus() == ITestResult.FAILURE) { //if it is failured
  
 			ScreenshotUtility screenShot = new ScreenshotUtility(); 
 			screenShot.getScreenshot(driver, iTestResult.getName()); //take screenshot of failed page
 		} 
 		//driver.quit(); 
  
 	}
	 
	 	}
 	

