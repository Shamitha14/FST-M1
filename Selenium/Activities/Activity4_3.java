package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity4_3 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//Third header text
		String thirdHeader=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third headet text is "+ thirdHeader);
		
		WebElement fifthElem=driver.findElement(By.cssSelector("h5.green"));
		String cssValue = fifthElem.getCssValue("color");
		System.out.println("Fifth header's Color is "+ cssValue);
	
		//Find violet button and print it's classes
		WebElement elem=driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
		String AttValue=elem.getAttribute("class");
		System.out.println("Violet button's classes are "+ AttValue);
		
		//Grey button using absolute xpath
		String greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Grey button Text is "+ greyButton);
		driver.quit();
	}
	
}
