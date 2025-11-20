import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_Calendars {

	public static void main(String[] args) throws InterruptedException {

		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Locate one way trip and check it is enabled or not
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isEnabled();
		
		//Check return date is enabled or not while selecting roundtrip
		
		//Select roundtrip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(3000);
		
		//To get attribute value
		driver.findElement(By.id("Div1")).getAttribute("style");
		
		//Check the value of style = 1, then it is enabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
			Assert.assertTrue(true);
		}
		
		driver.quit();
		
	}
	
	

}
