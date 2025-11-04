import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_Assertions1 {

	public static void main(String[] args) throws InterruptedException {

		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//Locate passenger dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		//Select Adult count as 5
		for(int i = 1; i < 5; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		//Click on Done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Check the selected adult count is 5 or not
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");	
		
		//Check whether family checkbox is not selected initially
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//Locate Family and Friends checkbox and click on it
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		//Check whether family checkbox is not selected initially
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());		
		
		//close the browser
		driver.quit();
		
	}

}
