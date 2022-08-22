package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//Finding check-box input element and printing if it's Selected
		WebElement element=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("Check box is Selected or not "+element.isSelected());
		
		//Clicking on the check-box
		driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
		
		//Printing if the Check-box is selected
		WebElement element1=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		System.out.println("Check box is Selected or not "+element1.isSelected());
		
		driver.quit();
		
	}	
}
