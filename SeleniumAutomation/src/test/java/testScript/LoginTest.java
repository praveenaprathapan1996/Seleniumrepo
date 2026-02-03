package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest  extends BaseTestNG
{@Test
public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException
{   
	//WebElement usernameButton=driver.findElement(By.id("user-name"));
	//usernameButton.sendKeys("standard_user");
	//WebElement passwordButton=driver.findElement(By.id("password"));
	//passwordButton.sendKeys("secret_sauce");
	//WebElement login_button=driver.findElement(By.id("login-button"));
	//login_button.click();
	String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;           //parmeterised constructor in the LoginPage
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnLoginButton();
	
	
}@Test
public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
{
	/*WebElement usernameButton=driver.findElement(By.id("user-name"));
	usernameButton.sendKeys("standard_user");
	WebElement passwordButton=driver.findElement(By.id("password"));
	passwordButton.sendKeys("secret");
	WebElement login_button=driver.findElement(By.id("login-button"));
	login_button.click();*/
	
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;           //parmeterised constructor in the LoginPage
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnLoginButton();
	
	
}@Test
public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
{
	/*WebElement usernameButton=driver.findElement(By.id("user-name"));
	usernameButton.sendKeys("user");
	WebElement passwordButton=driver.findElement(By.id("password"));
	passwordButton.sendKeys("secret_sauce");
	WebElement login_button=driver.findElement(By.id("login-button"));
	login_button.click();*/
	
	
	String username=ExcelUtility.getStringData(2, 0, "LoginPage");
	String password=ExcelUtility.getStringData(2, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;           //parmeterised constructor in the LoginPage
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnLoginButton();
}
@Test
public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException
{   
	/*WebElement usernameButton=driver.findElement(By.id("user-name"));
	usernameButton.sendKeys("user");
	WebElement passwordButton=driver.findElement(By.id("password"));
	passwordButton.sendKeys("sauce");
	WebElement login_button=driver.findElement(By.id("login-button"));
	login_button.click();*/
	
	String username=ExcelUtility.getStringData(3, 0, "LoginPage");
	String password=ExcelUtility.getStringData(3, 1, "LoginPage");
	LoginPage loginpage=new LoginPage(driver) ;           //parmeterised constructor in the LoginPage
	loginpage.enterUsernameOnUserNameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnLoginButton();
}
}
