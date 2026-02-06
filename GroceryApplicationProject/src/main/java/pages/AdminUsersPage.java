package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtility;

public class AdminUsersPage
{
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
     }
	
	@FindBy(xpath = "//a[@href='javascript:void(0)']")WebElement newButton_AdminUser;
	@FindBy(id="username")WebElement usernameField;
	@FindBy(id="password")WebElement passwordField;
	@FindBy(id="user_type")WebElement usertype_DropDown;
	@FindBy(name = "Create")WebElement saveButton;
	@FindBy(xpath = "//a[contains(text(),' Search')]")WebElement searchButton_AdminUser;
	@FindBy(id="un")WebElement usernameField_Search;
	@FindBy(id="ut")WebElement usertype_Search;
	@FindBy(name="Search")WebElement searchOption;
	@FindBy(xpath="//a[text()=' Reset']")WebElement refreshButton_AdminUser;
	
	
	
	public void clickOnNewButtonFromAdminUser() throws IOException
	{
		newButton_AdminUser.click();
	}
	public void enterUsernameField(String newUsername)
	{   
		usernameField.sendKeys(newUsername);
}
	public void enterPasswordField(String newPassword)
	{
		
		passwordField.sendKeys(newPassword);
	}
	public void selectUserType()
	{
		
		Select select=new Select(usertype_DropDown);
		select.selectByIndex(3);
	}
	public void clickOnSaveButton()
	{
		saveButton.click();
		
	}
	public void clickOnSearchButtonFromAdminUser()
	{   
		searchButton_AdminUser.click();
	}
	public void enterUsernameFieldForSearchUser()
	{
		
		usernameField_Search.sendKeys("Praveena");
	}
	public void selectUserTypeForSearchUser()
	{
		Select select=new Select(usertype_Search);
		select.selectByIndex(2);
	}
	public void clickOnSearchOption()
	{
		
		searchOption.click();
	}
	public void clickOnRefreshFromAdminUser()
	{
		refreshButton_AdminUser.click();
	}
}
