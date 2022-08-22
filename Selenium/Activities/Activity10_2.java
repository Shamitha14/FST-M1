package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String pageTitle =driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		
		Actions actions=new Actions(driver);
		Action seq1=actions.sendKeys("S").build();
		seq1.perform();
		
		WebElement keyPressed =driver.findElement(By.id("keyPressed"));
		System.out.println("First name key is: "+keyPressed.getText());
		
		Action seq2=actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
		seq2.perform();
		System.out.println("Pressed key is: " + keyPressed.getText());
		
		driver.quit();
	}

}
