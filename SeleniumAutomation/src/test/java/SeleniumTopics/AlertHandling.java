package SeleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseBasic
{
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confmAlrt=driver.findElement(By.xpath("//button[@id='alertButton']"));
		confmAlrt.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confrmAlrt1=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confrmAlrt1.click();
		Alert al=driver.switchTo().alert();
		//al.accept();
		al.dismiss();
		
	}
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confrmalrt2=driver.findElement(By.xpath("//button[@id='promtButton']"));
		confrmalrt2.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Praveena");
		al.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert=new AlertHandling();
		alert.intializeBrowser();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
	}

}
