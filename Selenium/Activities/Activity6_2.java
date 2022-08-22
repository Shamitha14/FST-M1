package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//Clicking on change content button
		driver.findElement(By.className("violet")).click();
		System.out.println("Change content button clicked");
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		String text=driver.findElement(By.id("ajax-content")).getText();
		System.out.println("Message is "+text);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		String text1=driver.findElement(By.id("ajax-content")).getText();
		System.out.println("Message is "+text1);
		
		driver.quit();
	}
}
