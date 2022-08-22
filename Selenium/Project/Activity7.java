package LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.xpath("//a[contains(text(), 'All Courses')]")).click();
		
		List<WebElement> courses=driver.findElements(By.xpath("//div[@id='ld_course_list']/div/div/div"));
		System.out.println("Number of courses are: "+courses.size());
		
		driver.quit();
 
	}

}
