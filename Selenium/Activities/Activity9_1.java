package selenium_b44;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement dropdown=driver.findElement(By.id("single-select"));
		Select select=new Select(dropdown);
		
		WebElement optionSelected =driver.findElement(By.id("single-value"));
		
		select.selectByVisibleText("Option 2");
		System.out.println(optionSelected.getText());
		
		select.selectByIndex(3);
		System.out.println(optionSelected.getText());
		
		select.selectByValue("4");
		System.out.println(optionSelected.getText());
		
		System.out.println("Options in the drop down are: ");
		List<WebElement> option=select.getOptions();
		for(WebElement list:option)
		{
			System.out.println(list.getText());
		}
		
		driver.quit();
	}

}
