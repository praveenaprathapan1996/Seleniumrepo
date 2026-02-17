package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constatnt.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	HomePage home;

	@Test(priority = 4, description = "Validating UserLogin with Valid Cridential", groups = { "smoke" })
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		home = loginpage.clickOnsignInButton();
		boolean dashBoardDisplayed = loginpage.dashBoardDisplayed();
		Assert.assertTrue(dashBoardDisplayed, Constant.VALIDCREDENTIALERROR);

	}

	@Test(priority = 3, description = "Validating UserLogin with invalid Password", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnsignInButton();
		boolean alertmsg = loginpage.alertFromInvalidcredntial();
		Assert.assertTrue(alertmsg, Constant.INVALIDPASSWORDERROR);

	}

	@Test(priority = 2, description = "Validating UserLogin with invalid Username", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnsignInButton();
		boolean signInToStart = loginpage.signInToStartYourSession();
		Assert.assertTrue(signInToStart, Constant.INVALIDUSERNAMEERROR);

	}

	@Test(priority = 1, description = "Validating UserLogin with invalid Cridential", groups = {
			"smoke" }, retryAnalyzer = retry.RetryMechanism.class, dataProvider = "loginProvider")
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword(String username, String password)
			throws IOException {
		// String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		// String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnsignInButton();
		String expected = "7rmart supermarket";
		String actual = loginpage.getTextFromTitle();
		Assert.assertEquals(actual, expected, Constant.INVALIDCREDENTIALERROR);

	}

	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" } };
		// new Object[] {ExcelUtility.getStringData(3,
		// 0,"LoginPage"),ExcelUtility.getStringData(3,1 ,"LoginPage")}

	}
}
