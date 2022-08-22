package LMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		WebElement firstInfoTitle=driver.findElement(By.xpath("//h3[contains(text(),' Actionable Training ')]"));
		String text=firstInfoTitle.getText();
		System.out.println("Title of the first info box is "+text);

		if(text.equals("Actionable Training"))
		{
			driver.quit();
		}
	}

}
