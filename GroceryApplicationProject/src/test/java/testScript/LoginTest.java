package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base
{
	@Test(priority = 4,description = "Validating UserLogin with Valid Cridential")
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		
	}
	@Test(priority = 3,description = "Validating UserLogin with Valid Cridential")
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0,"LoginPage");
		String password=ExcelUtility.getStringData(1, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
	}
	@Test(priority = 2,description = "Validating UserLogin with Valid Cridential")
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2, 0,"LoginPage" );
		String password=ExcelUtility.getStringData(2, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		
		
	}
	@Test(priority = 1,description = "Validating UserLogin with Valid Cridential")
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(3, 0,"LoginPage" );
		String password=ExcelUtility.getStringData(3, 1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
	}
	
}
