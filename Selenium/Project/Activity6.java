package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
	
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
		driver.quit();

	}

}
