package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		WebElement firstname= driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Shamitha");
		
		WebElement lastname= driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("Ammanna");
		
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("shamitha@gmail.com");
		
		WebElement number= driver.findElement(By.xpath("//input[@id='number']"));
		number.sendKeys("7898765432");
		
		driver.findElement(By.xpath("//input[@class='ui green button']")).submit();
		System.out.println("Submitted form successfully");
		driver.quit();
		
		
	}	

}
