package selenium_b44;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String pageTitle =driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		
		Actions builder=new Actions(driver);
		WebElement cube=driver.findElement(By.id("wrapD3Cube"));
		
		
		builder.click(cube).build().perform();
		WebElement activeSide=driver.findElement(By.xpath("//div[@class='active']"));
        System.out.println("Side in the front after left click: "+activeSide.getText());
        
        builder.doubleClick(cube).build().perform();
        WebElement activedoubleClick=driver.findElement(By.xpath("//div[@class='active']"));
        System.out.println("Side in the front after double click: "+activedoubleClick.getText());
		
        builder.contextClick(cube).build().perform();
        WebElement rightClick=driver.findElement(By.xpath("//div[@class='active']"));
        System.out.println("Side in the front after right click: "+rightClick.getText());
        
        driver.quit();
	}

}
