package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWithName {

	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	
	
	
	WebElement usernameTextField=driver.findElement(By.name("username"));
	usernameTextField.sendKeys("Darth");
	
	
	WebElement passwordTextfield=driver.findElement(By.name("password"));
	passwordTextfield.sendKeys("DaddyDarth");
	
	WebElement LoginButton=driver.findElement(By.className("_acap"));
	LoginButton.click();
	
}
}

