package selenium_b44;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables ");

		//List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		//System.out.println("Number of coulms are: "+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		System.out.println("Number of coulms are: "+cols.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println("Number of Rows are: "+rows.size());
		
		System.out.println("Third row values are: ");
		List<WebElement> thirdRow=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for(WebElement row:thirdRow)
		{
			System.out.println("\n"+row.getText());
		}
		//for(int i=0;i<thirdRow.size();i++)
		//System.out.println(thirdRow[i].getText());
		
		//Printing the cell value at the second row and second column
		String secondRowCol=driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]")).getText();
		System.out.println("Cell value at the second row and second column: "+secondRowCol);
		
		driver.quit();
		
	}

}
