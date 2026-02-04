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
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement refreshButton;
	
	public void clickOnNewButton()
	{
       newButton.click();
       newsTextField.sendKeys("Today is Holiday");
	   saveButton.click();
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	    searchField.sendKeys("Rainy Day");
	    searchOption.click();
	}
	
	public void clickOnRefreshButton()
	{
		refreshButton.click();
		driver.navigate().refresh();
	 }
	
}
