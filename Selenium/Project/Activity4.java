package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		WebElement secCourse=driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
		String secCourseTitle=secCourse.getText();
		System.out.println("Title of the second most popular course is: "+secCourseTitle);

		if(secCourseTitle.equals("Email Marketing Strategies"))
		{
			driver.quit();
		}
		
   }
	
}
