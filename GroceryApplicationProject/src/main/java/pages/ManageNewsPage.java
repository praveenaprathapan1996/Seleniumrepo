package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	WebElement newButton;
	@FindBy(id = "news")
	WebElement newsTextField;
	@FindBy(name = "create")
	WebElement saveButton;
	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement searchButton;
	@FindBy(name = "un")
	WebElement searchField;
	@FindBy(name = "Search")
	WebElement searchOption;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement resetButton;
	@FindBy(xpath = "//h3[text()='Enter News Informations']")
	WebElement enterNewsInformation;

	public ManageNewsPage clickOnNewButton() {
		newButton.click();
		return this;
	}

	public ManageNewsPage enterNewNews() {
		newsTextField.sendKeys("Today is Holiday");
		return this;
	}

	public ManageNewsPage clickOnSaveButton() {

		saveButton.click();
		return this;
	}

	public ManageNewsPage clickOnSearchButton() {
		searchButton.click();
		return this;
	}

	public ManageNewsPage enterNewsOnSearchManageNews() {
		searchField.sendKeys("Rainy Day");
		return this;
	}

	public ManageNewsPage clickOnSearchOption() {
		searchOption.click();
		return this;
	}

	public ManageNewsPage clickOnResetButton() {
		resetButton.click();
		return this;
	}

	public boolean enterNewsInformationDisplay() {
		return enterNewsInformation.isDisplayed();
	}

	public boolean searchButtonIsEnabled() {
		return searchOption.isEnabled();
	}

	public boolean resetButtonIsEnabled() {
		return resetButton.isEnabled();
	}
}
