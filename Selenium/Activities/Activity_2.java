package selenium_b44;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity_2 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element "+idLocator.getText());
		
		WebElement classNameLocator=driver.findElement(By.className("green"));
		System.out.println("Text in element "+classNameLocator.getText());
		
		WebElement linkTextLocator=driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element "+linkTextLocator.getText());
		
		WebElement cssLocator=driver.findElement(By.cssSelector("a#about-link"));
		System.out.println("Text in element "+cssLocator.getText());
		
		driver.quit();
	}

}
