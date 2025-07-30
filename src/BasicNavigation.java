import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

	public static void main(String[] args) {
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting url
		driver.get("https://automationexercise.com");
		
		//Getting Title
		driver.getTitle();
		
		//Printing the Title
		System.out.println(driver.getTitle());
		
		//Getting Current url
		driver.getCurrentUrl();
		
		//Printing Current url
		System.out.println(driver.getCurrentUrl());
		
		//Closing the browser
		driver.close();

	}

}
