package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
     }
	@FindBy(xpath =" //img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement adminLogOutIcon;
    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logOutButton;
    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement moreInfoManageNews;
   @FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement moreInfoAdminUser;
public void clickOnAdminIcon()
{
	adminLogOutIcon.click();
}
public void clickOnLogOutButton()
{
	logOutButton.click();
}
public void clickOnMoreInfoManageNews()
{
	moreInfoManageNews.click();
}
public void clickOnMoreInfoAdminUser()
{  
 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("arguments[0].click();",moreInfoAdminUser);
	
}

}
