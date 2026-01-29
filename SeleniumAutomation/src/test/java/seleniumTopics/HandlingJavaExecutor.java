package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HandlingJavaExecutor extends BaseBasic
{
public void verifyJavaScript()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement show_msg=driver.findElement(By.id("button-one"));
	JavascriptExecutor js=(JavascriptExecutor)driver;//casting
	js.executeScript("arguments[0].click();",show_msg);
	js.executeScript("window.scrollBy(0,350)","");//vertical sroll down giving value to y
	js.executeScript("window.scrollBy(0,-350)","");//vertical scroll up
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingJavaExecutor scrolldown=new HandlingJavaExecutor();
		scrolldown.intializeBrowser();
		scrolldown.verifyJavaScript();
	}

}
