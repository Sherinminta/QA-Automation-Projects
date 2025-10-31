import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_AutoSuggestive_Dropdowns4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//Locate Country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(3000);
		
		//Locate all the elements displayed in the list and store it to list		
		List<WebElement> options = driver.findElements(By.className("ui-corner-all"));		
		
		//Navigate through the list using for loop and check whether the element is INDIA or not
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("INDIA")) {
				
				option.click();
				break;
				
			}
			
		}
	}

}
