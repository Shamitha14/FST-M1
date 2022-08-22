package LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
		
		//Reading the page title and verify that it's on correct page
		driver.getTitle().contentEquals("My Account – Alchemy LMS");
		System.out.println("Title verified");
		
		driver.findElement(By.xpath("//a[contains(@class,'ld-login')]")).click();
		
		//Entering user name and password
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).submit();
		
		String loginUser=driver.findElement(By.xpath("//h1[contains(text(), '  My Account    ')]")).getText();
		if(loginUser.equals("My Account"))
		{
			System.out.println("User has logged in");
		}
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[contains(text(), 'All Courses')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'See more...')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]")).click();
		
		String courseTitle=driver.getTitle();
		if(courseTitle.contentEquals("Developing Strategy – Alchemy LMS"))
		{
			System.out.println("Title verified");
		}
		
		List<WebElement> markComplete=driver.findElements(By.xpath("//*[contains(text(),'Mark Complete')]"));
		if(markComplete.size()>0)
		{
			driver.findElement(By.xpath("//*[contains(text(),'Mark Complete')]")).click();
		}

		driver.quit();
	}

}
