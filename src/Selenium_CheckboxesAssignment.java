import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_CheckboxesAssignment {

	public static void main(String[] args) {

		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		//Check the first checkbox and verify it is successfully checked
		driver.findElement(By.name("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());		
		
		//Uncheck the first checkbox and verify it is successfully unchecked
		driver.findElement(By.name("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());		
		
		//Get count of checkboxes in the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
