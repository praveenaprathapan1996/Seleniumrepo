package seleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends BaseBasic
{
public void verifyMultipleWindow()
{
	driver.navigate().to("https://demo.guru99.com/popup.php");
	String parent_handle_id=driver.getWindowHandle();
	System.out.println(parent_handle_id);
	
WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
clickhere.click();
Set<String>handle_id=driver.getWindowHandles();
System.out.println(handle_id);
Iterator<String>it=handle_id.iterator();
while(it.hasNext())
{
	String current_id=it.next();
	if(!current_id.equals(parent_handle_id))
	{
		driver.switchTo().window(current_id);
		WebElement email=driver.findElement(By.xpath("//input[@name=\"emailid\"]"));
		email.sendKeys("praveenaprathapan1996@gmail.com");
		WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		submit.click();
	}
}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling window=new MultipleWindowHandling();
		window.intializeBrowser();
		window.verifyMultipleWindow();
	}

}
