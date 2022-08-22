package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity6_1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//Clicking on check box toggle button
		WebElement togggleCheckbox=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		togggleCheckbox.click();
		System.out.println("Remove checkbox button clicked");
		
		WebElement dynamicCheckbox=driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOf(dynamicCheckbox));
		
		togggleCheckbox.click();
		System.out.println("Add checkbox button clicked");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dynamicCheckbox']/input")));
		dynamicCheckbox.click();
		System.out.println("Checkbox clicked");
		
		driver.quit();
	}	
}
