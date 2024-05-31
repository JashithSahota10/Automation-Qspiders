package ActionsClass;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class WorkingWithMouseAndKeyboardActions {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		Actions a = new Actions(driver);
		a.contextClick().perform();
		
		WebElement mousehover = mousehover.;
		Robot r = new Robot();
		
		
		
	}
}
