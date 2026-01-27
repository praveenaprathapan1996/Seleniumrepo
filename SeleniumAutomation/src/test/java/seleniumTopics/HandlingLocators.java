package seleniumTopics;

import org.openqa.selenium.By;

public class HandlingLocators extends BaseBasic 
{
	
		public void verifyLocators()
		{
			driver.findElement(By.id("button-one"));
			driver.findElement(By.name("viewport"));
			driver.findElement(By.tagName("section"));
			driver.findElement(By.className("container page"));
			driver.findElement(By.linkText("Simple Form Demo"));
			driver.findElement(By.partialLinkText("Simple"));
			driver.findElement(By.cssSelector("button[id='button-one']"));
			driver.findElement(By.xpath("//button[@id='button-one']"));
			driver.findElement(By.xpath("//button[text()='Show Message']"));
			driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
			driver.findElement(By.xpath("//button[@id='button-one' and@type='button']"));
			driver.findElement(By.xpath("//button[@id='button-one' or @type='button1']"));
			driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent ::div[@class='card']"));
			driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
			driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
			driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
			driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
			driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
			
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}

		}
		///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button

