package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {
	public WebDriver driver;
	PageUtility page = new PageUtility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	WebElement adminLogOutIcon;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	WebElement logOutButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement moreInfoManageNews;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement moreInfoAdminUser;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement pageTitle;

	public HomePage clickOnAdminIcon() {
		adminLogOutIcon.click();
		return this;
	}

	public LoginPage clickOnLogOutButton() {
		logOutButton.click();
		return new LoginPage(driver);
	}

	public ManageNewsPage clickOnMoreInfoManageNews() {
		moreInfoManageNews.click();
		return new ManageNewsPage(driver);
	}

	public AdminUsersPage clickOnMoreInfoAdminUser() {
		page.clickUsingJavascriptExcecutor(driver, moreInfoAdminUser);
		return new AdminUsersPage(driver);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();", moreInfoAdminUser);

	}

	public boolean loginPageDisplayWhenLogOut() {
		return pageTitle.isEnabled();
	}
}
