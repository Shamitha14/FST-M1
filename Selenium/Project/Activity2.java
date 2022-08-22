package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		String heading=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		System.out.println("Heading of the web page is: "+heading);
		
		if(heading.contentEquals("Learn from Industry Experts"))
		{
			driver.quit();
		}
		

	}

}
