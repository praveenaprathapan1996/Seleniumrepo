package SeleniumTopics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction extends BaseBasic
{
	public void verifyRightClick()
	{
		WebElement others=driver.findElement(By.xpath("//a[@id='others']"));
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAction actions=new HandlingAction();
		actions.intializeBrowser();
		actions.verifyRightClick();
	}

}
