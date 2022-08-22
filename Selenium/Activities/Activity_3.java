package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
public class Activity_3 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		WebElement firstname= driver.findElement(By.id("firstName"));
		firstname.sendKeys("Shamitha");
		
		WebElement lastname= driver.findElement(By.id("lastName"));
		lastname.sendKeys("Ammanna");
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("shamitha@gmail.com");
		
		WebElement number= driver.findElement(By.id("number"));
		number.sendKeys("7898765432");
		
		driver.findElement(By.className("green")).click();
		driver.quit();
		
		
	}	
}
