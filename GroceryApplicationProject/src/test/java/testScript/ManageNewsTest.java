package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base
{
	@Test(description = "Validating that user can add new news ")
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
	manageNews.enterNewNews();
	manageNews.clickOnSaveButton();
	boolean enterNewsInfor=manageNews.enterNewsInformationDisplay();
	Assert.assertTrue(enterNewsInfor, "User unable to add new news");

}
	@Test(description = "Validating user can able to Search  News")
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
	manageNews.enterNewsOnSearchManageNews();
	manageNews.clickOnSearchOption();
	boolean searchEnable=manageNews.searchButtonIsEnabled();
	Assert.assertTrue(searchEnable, "User unable to search news");
	
}
	@Test(description ="Validating that user can Reset  Manage news page")
	public void verifyUserIsAbleToResetNews() throws IOException
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
		manageNews.clickOnResetButton();
		boolean resetEnable=manageNews.resetButtonIsEnabled();
		Assert.assertTrue(resetEnable, "user unable to reset manage new page");
	}
}
