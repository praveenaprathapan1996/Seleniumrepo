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
	HomePage homepage;
	AdminUsersPage adminUserPage;

	@Test(description = "Validating new User creation", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToAddNewUsers() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		adminUserPage = homepage.clickOnMoreInfoAdminUser();
		adminUserPage.clickOnNewButtonFromAdminUser();
		FakerUtility faker = new FakerUtility();
		String newUsername = faker.createRandomUsername();
		String newPassword = faker.createRandomPassword();
		adminUserPage.enterUsernameField(newUsername).enterPasswordField(newPassword).selectUserType()
				.clickOnSaveButton();
		String expected = "Admin Users";
		String actual = adminUserPage.getTextFromAdminUserTitle();
		Assert.assertEquals(actual, expected, Constant.ADDNEWUSERERROR);

	}

	@Test(description = "Validating Search Users", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToSearchUsers() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		String usernamesearchUser = ExcelUtility.getStringData(0, 0, "AdminUser");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		adminUserPage = homepage.clickOnMoreInfoAdminUser();
		adminUserPage.clickOnSearchButtonFromAdminUser().enterUsernameFieldForSearchUser(usernamesearchUser)
				.selectUserTypeForSearchUser().clickOnSearchOption();
		boolean serachselection = adminUserPage.searchOptionIsEnabled();
		Assert.assertTrue(serachselection, Constant.SEARCHUSERERROR);

	}

	@Test(description = "Validating Reset Page")
	public void verifyUserIsAbleToRefreshAdminUsersPage() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		adminUserPage = homepage.clickOnMoreInfoAdminUser();
		adminUserPage.clickOnResetFromAdminUser();
		boolean resetoption = adminUserPage.resetButtonIsEnabled();
		Assert.assertTrue(resetoption, Constant.ADMINUSERRESTERROR);

	}
}
