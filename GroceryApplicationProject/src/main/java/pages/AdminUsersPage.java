package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {
	public WebDriver driver;
	WaitUtility wait = new WaitUtility();
	PageUtility page = new PageUtility();

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement newButton_AdminUser;
	@FindBy(id = "username")
	WebElement usernameField;
	@FindBy(id = "password")
	WebElement passwordField;
	@FindBy(id = "user_type")
	WebElement usertype_DropDown;
	@FindBy(name = "Create")
	WebElement saveButton;
	@FindBy(xpath = "//a[contains(text(),' Search')]")
	WebElement searchButton_AdminUser;
	@FindBy(id = "un")
	WebElement usernameField_Search;
	@FindBy(id = "ut")
	WebElement usertype_Search;
	@FindBy(name = "Search")
	WebElement searchOption;
	@FindBy(xpath = "//h1[text()='Admin Users']")
	WebElement adminUserText;
	@FindBy(xpath = "//a[text()=' Reset']")
	WebElement resetButton_AdminUser;
	@FindBy(xpath = "//h1[text()='Admin Users']")
	WebElement adminUserTitle;

	public AdminUsersPage clickOnNewButtonFromAdminUser() throws IOException {
		newButton_AdminUser.click();
		return this;
	}

	public AdminUsersPage enterUsernameField(String newUsername) {
		usernameField.sendKeys(newUsername);
		return this;
	}

	public AdminUsersPage enterPasswordField(String newPassword) {

		passwordField.sendKeys(newPassword);
		return this;
	}

	public AdminUsersPage selectUserType() {

		page.selectDropdownWithIndex(usertype_DropDown, 3);
		return this;

		// Select select = new Select(usertype_DropDown);
		// select.selectByIndex(3);
	}

	public AdminUsersPage clickOnSaveButton() {
		wait.waitUntilElementToBeClickable(driver, saveButton);
		saveButton.click();
		return this;

	}

	public AdminUsersPage clickOnSearchButtonFromAdminUser() {

		searchButton_AdminUser.click();
		return this;
	}

	public AdminUsersPage enterUsernameFieldForSearchUser() {

		usernameField_Search.sendKeys("Praveena");
		return this;
	}

	public AdminUsersPage selectUserTypeForSearchUser() {
		page.selectDropdownWithIndex(usertype_Search, 2);
		return this;
		// Select select = new Select(usertype_Search);
		// select.selectByIndex(2);
	}

	public AdminUsersPage clickOnSearchOption() {
		wait.waitUntilElementToBeClickable(driver, searchOption);
		searchOption.click();
		return this;
	}

	public AdminUsersPage clickOnResetFromAdminUser() {
		resetButton_AdminUser.click();
		return this;
	}

	public String getTextFromAdminUserTitle() {
		return adminUserTitle.getText();
	}

	public boolean resetButtonIsEnabled() {
		return resetButton_AdminUser.isEnabled();
	}

	public boolean searchOptionIsEnabled() {
		return searchOption.isEnabled();
	}
}
