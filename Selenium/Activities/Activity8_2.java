package selenium_b44;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables ");
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		System.out.println("Number of coulms are: "+cols.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("Number of Rows are: "+rows.size());
		
		String secRowCol=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println("Cell value at the second row and second column: "+secRowCol);

		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
		
		String secRowCol2=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println("Cell value at the second row and second column after sorting by name: "+secRowCol2);
		
		System.out.println("Cell values of the table footer : ");
		List<WebElement> footerCell=driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
		for(WebElement footer: footerCell)
		{
			System.out.println(footer.getText());
		}
		
		driver.quit();
		
	}

}
