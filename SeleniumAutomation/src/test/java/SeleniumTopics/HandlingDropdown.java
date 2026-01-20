package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdown extends BaseBasic
{
	public void verifyDropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByVisibleText("Python");
		select.selectByValue("c#");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HandlingDropdown dropdown=new HandlingDropdown();
			dropdown.intializeBrowser();
			dropdown.verifyDropDown();
		}
}
