package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement usernameField;
	@FindBy(name = "password")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboradTitle;
	@FindBy(xpath = "//p[text()='Sign in to start your session']")
	WebElement startYourSession;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")
	WebElement pageTitle;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement alertMessage;

	public LoginPage enterUsernameOnUserNameField(String username) {
		usernameField.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
		return this;
	}

	public HomePage clickOnsignInButton() {
		signInButton.click();
		return new HomePage(driver);
	}

	public boolean dashBoardDisplayed() {
		return dashboradTitle.isDisplayed();
	}

	public boolean signInToStartYourSession() {
		return startYourSession.isDisplayed();
	}

	public String getTextFromTitle() {
		return pageTitle.getText();
	}

	public boolean alertFromInvalidcredntial() {
		return alertMessage.isDisplayed();
	}
}
