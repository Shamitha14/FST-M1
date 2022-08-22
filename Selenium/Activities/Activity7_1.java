package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
		
		String text=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Login message is "+text);
		
		driver.quit();
	}
}
