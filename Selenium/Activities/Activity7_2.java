package selenium_b44;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("sham");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
		driver.findElement(By.xpath("//label[contains(text(), 'Email')]/following::input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
		
		String successMessage=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(successMessage);
		
		driver.quit();
	}
}
