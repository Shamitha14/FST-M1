package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.xpath("//a[contains(text(), 'Contact')]")).click();
		
		driver.findElement(By.name("wpforms[fields][0]")).sendKeys("sham");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sham@gmail.com");
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Message");
		driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Hello, world!!");
		driver.findElement(By.name("wpforms[submit]")).submit();
		Thread.sleep(1500);
		
		String message=driver.findElement(By.xpath("//div[contains(@class,'background-color')]/div[2]/div[2]/p")).getText();
		System.out.println("Message after submission: "+message);
		
		driver.quit();

	}

}
