package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constatnt.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	HomePage homepage;

	@Test(description = "Validating Logout functionality from HomePage")
	public void verifyUserIsAbleToSuccessfullyLogOut() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		homepage.clickOnAdminIcon();
		loginpage = homepage.clickOnLogOutButton();
		boolean logoutTitle = homepage.loginPageDisplayWhenLogOut();
		Assert.assertTrue(logoutTitle, Constant.LOGOUTERROR);

	}

}
