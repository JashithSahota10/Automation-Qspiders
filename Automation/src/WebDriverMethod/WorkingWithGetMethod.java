package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithGetMethod {
	
	public static void main(String[] args) {
		
		
		//to launch chrome driver
		WebDriver driver = new ChromeDriver();
		
		
		//to maximize the window
		driver.manage().window().maximize();
		
		
		//to launch website
		driver.get("https://www.amazon.in");
	
	
			
			//to maximize the window
			driver.manage().window().maximize();
			
			
		
}
}

