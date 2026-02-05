package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base
{
	@Test(description = "Validating New Button from AdminUser Page")
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
	
}@Test(description = "Validating Search Button from AdminUser Page")
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
	
	}
@Test(description = "Validating Refresh Button from Admin User")
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
	adminUserPage.clickOnRefreshFromAdminUser();
	
}
}
