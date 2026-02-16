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
	WaitUtility wait=new WaitUtility();
	PageUtility page=new PageUtility();

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
	@FindBy(xpath = "//a[text()='Home']")
	WebElement homeText;
	@FindBy(xpath = "//a[text()=' Reset']")
	WebElement resetButton_AdminUser;
	@FindBy(xpath = "//h1[text()='Admin Users']")
	WebElement adminUserTitle;

	public void clickOnNewButtonFromAdminUser() throws IOException {
		newButton_AdminUser.click();
	}

	public void enterUsernameField(String newUsername) {
		usernameField.sendKeys(newUsername);
	}

	public void enterPasswordField(String newPassword) {

		passwordField.sendKeys(newPassword);
	}

	public void selectUserType() {
		
		page.selectDropdownWithIndex(usertype_DropDown, 3);

		//Select select = new Select(usertype_DropDown);
		//select.selectByIndex(3);
	}

	public void clickOnSaveButton() {
		wait.waitUntilElementToBeClickable(driver, saveButton);
		saveButton.click();

	}

	public void clickOnSearchButtonFromAdminUser() {

		searchButton_AdminUser.click();
	}

	public void enterUsernameFieldForSearchUser() {

		usernameField_Search.sendKeys("Praveena");
	}

	public void selectUserTypeForSearchUser() {
		page.selectDropdownWithIndex(usertype_Search, 2);
		
		//Select select = new Select(usertype_Search);
		//select.selectByIndex(2);
	}

	public void clickOnSearchOption() {
        wait.waitUntilElementToBeClickable(driver, searchOption);
		searchOption.click();
	}

	public void clickOnResetFromAdminUser() {
		resetButton_AdminUser.click();
	}

	public String getTextFromAdminUserTitle() {
		return adminUserTitle.getText();
	}

	public boolean homeTextDisplay() {
		return homeText.isDisplayed();
	}

	public boolean searchOptionIsEnabled() {
		return searchOption.isEnabled();
	}
}
