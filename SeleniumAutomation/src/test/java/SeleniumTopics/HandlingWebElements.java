package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HandlingWebElements extends BaseBasic 
{
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("Sample text message");
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		WebElement fetchmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(fetchmessage.getText());
		messagebox.clear();
		WebElement totalbutton=driver.findElement(By.id("button-two"));
		System.out.println(totalbutton.getTagName());
		System.out.println(showMessage.getCssValue("color"));
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HandlingWebElements webelements=new HandlingWebElements();
			webelements.intializeBrowser();
			webelements.verifyWebElements();
			
		}

	}

