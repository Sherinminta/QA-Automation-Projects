import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Dropdowns2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Locate passenger dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		//Select Adult count as 5
		for(int i = 1; i < 5; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		//Click on Done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Print the selected passenger count
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//close the browser
		driver.quit(); 
		

	}

}
