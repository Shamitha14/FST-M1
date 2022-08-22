package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
		
		//Reading the page title and verify that it's on correct page
		driver.getTitle().contentEquals("My Account – Alchemy LMS");
		System.out.println("Title verified");
		
		driver.quit();
	
	}

}
