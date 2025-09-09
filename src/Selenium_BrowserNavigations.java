import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_BrowserNavigations {

	public static void main(String[] args) {
	
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to another url
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//Navigate back to previous url
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//Navigate forward
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		//Close the browser
		driver.quit();

	}

}
