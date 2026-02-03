package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNG 
{
	public WebDriver driver;
	@BeforeMethod
	public void intializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	//@AfterMethod
	//public void closeAndQuite()
	{
	//	//driver.close();
		//driver.quit();
		
	}
}
