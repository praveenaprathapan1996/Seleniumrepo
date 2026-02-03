package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public void intializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	}
	//@AfterMethod
	//public void closeAndQuite()
	{
	//	//driver.close();
		//driver.quit();
		
	}
}
