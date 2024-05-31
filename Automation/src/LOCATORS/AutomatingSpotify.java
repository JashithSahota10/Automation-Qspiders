package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSpotify {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.cssSelector("html not-front not-logged-in no-sidebars page-node page-node- page-node-765 node-type-basic-page i18n-en site-name-hidden atv-7.x-1.2")).click();
		
	}
}
