import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_LocatorsPractice3_ParentChildTraverse {

	public static void main(String[] args) {
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Locate practice button - Parent to child traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		
		//Locate the button next to Practice button - Sibling to Sibling traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//Locate the button next to Practice button - Child to Parent traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		//Close the browser
		driver.quit();	
		
	}

}
