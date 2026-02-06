package seleniumTopics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandlingWebElements extends BaseBasic 
{
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Sample text message");
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));       //Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessage));
		//fluent wait
		Wait<WebDriver>fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        fluent.until(ExpectedConditions.elementToBeClickable(showMessage));
		
		showMessage.click();
		WebElement fetchmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(fetchmessage.getText());
		messagebox.clear();
		WebElement totalbutton=driver.findElement(By.id("button-two"));
		System.out.println(totalbutton.getTagName());
		System.out.println(showMessage.getCssValue("color"));
		System.out.println(showMessage.isDisplayed());
		System.out.println(showMessage.isEnabled());
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HandlingWebElements webelements=new HandlingWebElements();
			webelements.intializeBrowser();
			webelements.verifyWebElements();
			
		}

	}

