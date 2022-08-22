package LMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		

		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		String pageTitle=driver.getTitle();
		System.out.println("Title of the page is: "+pageTitle);
		
		if(pageTitle.contentEquals("Alchemy LMS – An LMS Application"))
		{
			System.out.println("page title matches: Alchemy LMS – An LMS Application");
			driver.quit();
		}

	}

}
