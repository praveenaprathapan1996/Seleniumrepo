package SeleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseBasic
{
public WebDriver driver;
public void intializeBrowser()
{
	driver =new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	BaseBasic basic =new BaseBasic();
	basic.intializeBrowser();

}

}