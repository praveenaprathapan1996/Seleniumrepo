package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends BaseBasic
{
public void verifyFrames()
{
	driver.navigate().to("https://demoqa.com/frames");
	List <WebElement>totalFrame=driver.findElements(By.tagName("iframe"));
	System.out.println(totalFrame.size());
	
	WebElement frame1=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame1);
	WebElement frameheading=driver.findElement(By.id("sampleHeading"));
	System.out.println(frameheading.getText());
	driver.switchTo().defaultContent();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames=new HandlingFrames();
		frames.intializeBrowser();
		frames.verifyFrames();
	}

}
