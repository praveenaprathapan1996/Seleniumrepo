package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constatnt.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	@Test(description = "Validating new User creation")
	public void verifyUserIsAbleToAddNewUsers() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMoreInfoAdminUser();
		AdminUsersPage adminUserPage = new AdminUsersPage(driver);
		adminUserPage.clickOnNewButtonFromAdminUser();
		FakerUtility faker = new FakerUtility();
		String newUsername = faker.createRandomUsername();
		String newPassword = faker.createRandomPassword();
		adminUserPage.enterUsernameField(newUsername);
		adminUserPage.enterPasswordField(newPassword);
		adminUserPage.selectUserType();
		adminUserPage.clickOnSaveButton();
		String expected = "Admin Users";
		String actual = adminUserPage.getTextFromAdminUserTitle();
		Assert.assertEquals(actual, expected, Constant.ADDNEWUSERERROR);

	}

	@Test(description = "Validating Search Users", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToSearchUsers() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMoreInfoAdminUser();
		AdminUsersPage adminUserPage = new AdminUsersPage(driver);
		adminUserPage.clickOnSearchButtonFromAdminUser();
		adminUserPage.enterUsernameFieldForSearchUser();
		adminUserPage.selectUserTypeForSearchUser();
		adminUserPage.clickOnSearchOption();
		boolean serachselection = adminUserPage.searchOptionIsEnabled();
		Assert.assertTrue(serachselection, Constant.SEARCHUSERERROR);

	}

	@Test(description = "Validating Reset Page", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToRefreshAdminUsersPage() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnsignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMoreInfoAdminUser();
		AdminUsersPage adminUserPage = new AdminUsersPage(driver);
		adminUserPage.clickOnResetFromAdminUser();
		boolean resetoption = adminUserPage.homeTextDisplay();
		Assert.assertFalse(resetoption, Constant.ADMINUSERRESTERROR);

	}
}
