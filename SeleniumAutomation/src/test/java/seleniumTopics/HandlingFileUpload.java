package seleniumTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends BaseBasic
{
	public void fileUploadusingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\prave\\git\\Seleniumrepo\\SeleniumAutomation\\src\\test\\resources\\Jan 23 Uber to Hotel.pdf");
		WebElement acceptchekbox=driver.findElement(By.id("terms"));
		acceptchekbox.click();
		WebElement submitbutton=driver.findElement(By.id("submitbutton"));
		submitbutton.click();
	}
public void fileuploadusingRobot() throws AWTException
{
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement selectpdf=driver.findElement(By.id("pickfiles"));
	selectpdf.click();
	StringSelection selection=new StringSelection("C:\\Users\\prave\\git\\Seleniumrepo\\SeleniumAutomation\\src\\test\\resources\\Jan 23 Uber to Hotel.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Robot r=new Robot();
	r.delay(2500);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload upload=new HandlingFileUpload();
		upload.intializeBrowser();
		upload.fileUploadusingSendkeys();
		//try {
			//upload.fileuploadusingRobot();
		//} catch (AWTException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		
	}

	}
