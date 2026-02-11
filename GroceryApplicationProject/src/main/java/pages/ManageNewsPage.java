package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage 
{
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
     }
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")WebElement newButton;
	@FindBy(id="news")WebElement newsTextField;
	@FindBy(name="create")WebElement saveButton;
	@FindBy(xpath ="//a[@href='javascript:void(0)']")WebElement searchButton;
	@FindBy(name="un")WebElement searchField;
	@FindBy(name="Search")WebElement searchOption;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement resetButton;
	@FindBy(xpath = "//h3[text()='Enter News Informations']")WebElement enterNewsInformation;
	
	public void clickOnNewButton()
	{
       newButton.click();
       
	}
	public void enterNewNews()
	{
       newsTextField.sendKeys("Today is Holiday");
       
	}
	public void clickOnSaveButton()
	{
	
	   saveButton.click();
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	public void enterNewsOnSearchManageNews()
	{
	    searchField.sendKeys("Rainy Day");
	}
	public void clickOnSearchOption()
	{
	    searchOption.click();
	}
	
	public void clickOnResetButton()
	{
		resetButton.click();
		
	 }
	public boolean enterNewsInformationDisplay()
	{
		return enterNewsInformation.isDisplayed();
	}
	public boolean searchButtonIsEnabled()
	{
		return searchOption.isEnabled();
	}
	public boolean resetButtonIsEnabled()
	{
		return resetButton.isEnabled();
	}
}
