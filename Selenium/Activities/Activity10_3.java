package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Activity10_3 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/drag-drop");
		Actions actions=new Actions(driver);
		
		String pageTitle =driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		
		//Drag and drop to Dropzone1
		WebElement ball=driver.findElement(By.id("draggable"));
		WebElement dropZone1=driver.findElement(By.id("droppable"));
		actions.dragAndDrop(ball, dropZone1).build().perform();
		String dropped=driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).getText();
		
		if(dropped.contains(dropped))
		{
			System.out.println("Entered drop1");
		}
		
		//Drag and drop to Dropzone2
		WebElement dropZone2=driver.findElement(By.id("dropzone2"));
		actions.dragAndDrop(ball, dropZone2).build().perform();
		String dropped2=driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).getText();
		
		if(dropped.contains(dropped2))
		{
			System.out.println("Entered drop2");
		}

		driver.quit();
	}

}
