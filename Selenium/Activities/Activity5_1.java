package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
	
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//Finding check-box input element and printing if it's displayed
		WebElement element=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("Check box value is "+element.isDisplayed());
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		//Finding if the element is displayed
		WebElement element1=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("Check box value is "+element1.isDisplayed());
		
		driver.quit();
		
	}	
}
