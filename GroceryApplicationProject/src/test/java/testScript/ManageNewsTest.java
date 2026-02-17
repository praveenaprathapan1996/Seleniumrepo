package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constatnt.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	HomePage homepage;
	ManageNewsPage manageNews;

	@Test(description = "Validating that user can add new news ", retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		manageNews = homepage.clickOnMoreInfoManageNews();
		manageNews.clickOnNewButton().enterNewNews().clickOnSaveButton();
		boolean enterNewsInfor = manageNews.enterNewsInformationDisplay();
		Assert.assertTrue(enterNewsInfor, Constant.ADDNEWNEWSERROR);

	}

	@Test(description = "Validating user can able to Search  News",retryAnalyzer = retry.RetryMechanism.class)
	public void verifyUserIsAbleToSearchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		manageNews = homepage.clickOnMoreInfoManageNews();
		manageNews.clickOnSearchButton().enterNewsOnSearchManageNews().clickOnSearchOption();
		boolean searchEnable = manageNews.searchButtonIsEnabled();
		Assert.assertTrue(searchEnable, Constant.SEARCHNEWSERROR);

	}

	@Test(description = "Validating that user can Reset  Manage news page")
	public void verifyUserIsAbleToResetNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnsignInButton();
		manageNews = homepage.clickOnMoreInfoManageNews();
		manageNews.clickOnResetButton();
		boolean resetEnable = manageNews.resetButtonIsEnabled();
		Assert.assertTrue(resetEnable, Constant.MANAGENEWSRESETERROR);
	}
}
