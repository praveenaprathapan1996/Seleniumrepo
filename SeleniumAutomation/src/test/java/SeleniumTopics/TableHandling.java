package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends BaseBasic
{
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
		//to get entire table
		//System.out.println(table.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.intializeBrowser();
		table.verifyTable();
	}

}
