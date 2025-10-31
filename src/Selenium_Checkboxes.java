import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Checkboxes {

	public static void main(String[] args) {

		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//Locate Family and Friends checkbox and click on it
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		//Check whether the checkbox is selected or not
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//Find the number of checkboxes available in the website
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.quit();
	
	}

}
