package SeleniumTopics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction extends BaseBasic
{
	public void verifyRightClick()
	{
		WebElement others=driver.findElement(By.xpath("//a[@id='others']"));
		Actions action=new Actions(driver);
		action.contextClick(others).build().perform();
	}
	public void verifyMouseHover()
	{
		WebElement others=driver.findElement(By.xpath("//a[@id='others']"));
		Actions action=new Actions(driver);
		action.moveToElement(others).build().perform();
	}
	public void verifyDragDrop()
	{  driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		
	}
	public void verifyKeyBoard() throws AWTException
	{
	 Robot robot=new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_T);
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_T);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAction actions=new HandlingAction();
		actions.intializeBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseHover();
		actions.verifyDragDrop();
		//try {
		//	actions.verifyKeyBoard();
		//} catch (AWTException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	}

}
