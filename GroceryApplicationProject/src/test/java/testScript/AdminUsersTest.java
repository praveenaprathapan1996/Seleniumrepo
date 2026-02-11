package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base
{
	@Test(description = "Validating new User creation")
public void verifyUserIsAbleToAddNewUsers() throws IOException
{
	String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;         
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnsignInButton();
	HomePage homepage=new HomePage(driver);
    homepage.clickOnMoreInfoAdminUser();
	AdminUsersPage adminUserPage=new AdminUsersPage(driver);
	adminUserPage.clickOnNewButtonFromAdminUser();
	FakerUtility faker=new FakerUtility();
	String newUsername=faker.createRandomUsername();
	String newPassword=faker.createRandomPassword();
	adminUserPage.enterUsernameField(newUsername);
	adminUserPage.enterPasswordField(newPassword);
	adminUserPage.selectUserType();
	adminUserPage.clickOnSaveButton();
	String expected="Admin Users";
	String actual=adminUserPage.getTextFromAdminUserTitle();
	Assert.assertEquals(actual,expected,"User  unable to create new user");
	
}@Test(description = "Validating Search Users")
public void verifyUserIsAbleToSearchUsers() throws IOException
{
	String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;         
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnsignInButton();
	HomePage homepage=new HomePage(driver);
    homepage.clickOnMoreInfoAdminUser();
	AdminUsersPage adminUserPage=new AdminUsersPage(driver);
	adminUserPage.clickOnSearchButtonFromAdminUser();
	adminUserPage.enterUsernameFieldForSearchUser();
	adminUserPage.selectUserTypeForSearchUser();
	adminUserPage.clickOnSearchOption();
    boolean serachselection=adminUserPage.searchOptionIsEnabled();
    Assert.assertTrue(serachselection, "User unable to search Users");
    
	
	
	}
@Test(description = "Validating Reset Page")
public void verifyUserIsAbleToRefreshAdminUsersPage() throws IOException
{
	String username=ExcelUtility.getStringData(0, 0,"LoginPage" );
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;         
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnsignInButton();
	HomePage homepage=new HomePage(driver);
    homepage.clickOnMoreInfoAdminUser();
	AdminUsersPage adminUserPage=new AdminUsersPage(driver);
	adminUserPage.clickOnResetFromAdminUser();
	boolean resetoption=adminUserPage.resetButtonIsEnabled();
	Assert.assertFalse(resetoption, "User can reset AdminUser page");
	
}
}
