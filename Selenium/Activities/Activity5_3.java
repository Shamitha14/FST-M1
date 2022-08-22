package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//Checking if Text field is enabled
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Check box is Selected or not- "+element.isEnabled());
		
		driver.findElement(By.id("toggleInput")).click();
		
		//Checking if Text field is enabled
				WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
				System.out.println("Check box is Selected or not- "+element1.isEnabled());
		
		driver.quit();		
	}	

}
