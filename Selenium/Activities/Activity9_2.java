package selenium_b44;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");

		WebElement multiSelect=driver.findElement(By.id("multi-select"));
		Select select=new Select(multiSelect);
		
		WebElement opinion=driver.findElement(By.id("multi-value"));
		
		if(select.isMultiple())
		{
			select.selectByVisibleText("Javascript");
			System.out.println(opinion.getText());
			
			select.selectByValue("node");
			System.out.println(opinion.getText());
			
			for(int i=4;i<=6;i++)
			{
				select.selectByIndex(i);
			}
			System.out.println(opinion.getText());
			
			select.deselectByValue("node");
			System.out.println(opinion.getText());
			
			select.deselectByIndex(7);
			System.out.println(opinion.getText());
			
			List<WebElement> firstSelected=select.getAllSelectedOptions();
			for(WebElement firstValue:firstSelected)
			{
				System.out.println("Selected option: "+opinion.getText());
			}
			
			select.deselectAll();
			System.out.println(opinion.getText());
		}
		
		
		driver.quit();
	}

}
