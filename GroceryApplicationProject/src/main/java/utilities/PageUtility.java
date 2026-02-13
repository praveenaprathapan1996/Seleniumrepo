package utilities;

import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectDropdownWithValue(WebElement element, String value) {

		Select object = new Select(element);
		object.selectByValue(value);

	}

	public void selectDropdownWithIndex(WebElement element, int index) {
		Select object = new Select(element);
		object.selectByIndex(index);
	}

	public void checkBoxWithIsDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public void mouseActionWithRightClick(WebDriver driver, WebElement element) {
		Actions object = new Actions(driver);
		object.contextClick(element).build().perform();
	}

	public void mouseActionWithDragAndDrop(WebDriver driver, WebElement source_element, WebElement target_element) {
		Actions object = new Actions(driver);
		object.dragAndDrop(source_element, target_element).build().perform();
	}

	public void radioButtonWithIsEnabled(WebElement element) {
		element.isEnabled();
	}
}
