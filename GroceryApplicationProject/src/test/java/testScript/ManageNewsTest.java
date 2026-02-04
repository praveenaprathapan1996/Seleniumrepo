package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base
{
	@Test(description = "Validating New Button from Manage News Page")
public void verifyUserIsAbleToAddNewNews() throws IOException
{
	String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;         
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnsignInButton();
	HomePage homepage=new HomePage(driver);
	homepage.clickOnMoreInfoManageNews();
	ManageNewsPage manageNews=new ManageNewsPage(driver);
	manageNews.clickOnNewButton();

}
	@Test(description = "Validating Search Button from Manage News")
public void verifyUserIsAbleToSearchNews() throws IOException
{
	String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;         
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnsignInButton();
	HomePage homepage=new HomePage(driver);
	homepage.clickOnMoreInfoManageNews();
	ManageNewsPage manageNews=new ManageNewsPage(driver);
	manageNews.clickOnSearchButton();
	
}
	@Test(description ="Validating Refresh Button from Manage news")
	public void verifyUserIsAbleToRefreshNews() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
		String password=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver) ;         
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		HomePage homepage=new HomePage(driver);
		homepage.clickOnMoreInfoManageNews();
		ManageNewsPage manageNews=new ManageNewsPage(driver);
		manageNews.clickOnRefreshButton();
	}
}
