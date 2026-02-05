package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base
{

	@Test(description = "Validating MoreInfo from ManageNews ")
public void verifyUserIsAbleToclickOnMoreInfoManageNews() throws IOException
{
	String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;         
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnsignInButton();
	HomePage homepage=new HomePage(driver);
	homepage.clickOnMoreInfoManageNews();
	
} 
	@Test(description = "Validating MoreInfo from AdimUser")
	public void verifyUserIsAbleToClickOnAdminUsers() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
	  	HomePage homepage=new HomePage(driver);
	    homepage.clickOnMoreInfoAdminUser();
	}
	
	@Test(description = "Validating Logout functionality from HomePage")
	public void verifyUserIsAbleToSuccessfullyLogOut() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		HomePage homepage=new HomePage(driver);
		homepage.clickOnAdminIcon();
		homepage.clickOnLogOutButton();
		
	}
	
}
