package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		String newTitle= driver.getTitle();
		System.out.println("New title of the page is "+newTitle);
		
		driver.quit();
	}

}
