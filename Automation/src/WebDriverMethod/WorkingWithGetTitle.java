package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitle {

	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		//to maximize the window
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.in");
		
		String actual_title = driver.getTitle();
		
		String expected_title="Amazon.in";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is wrong");
		}
		System.out.println("Title is " + actual_title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
}
