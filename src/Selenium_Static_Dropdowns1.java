import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Static_Dropdowns1 {

	public static void main(String[] args) {

		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
		
		//Locating currency dropdown and storing its value to a variable
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Create object of select class and pass the dropown location
		Select dropdown = new Select(staticDropdown);
		
		//Select the element which is at 3rd index
		dropdown.selectByIndex(3);
		
		//Print the selected value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Select the text AED - by visible text
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Select the value INR
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Close the browser
		driver.quit();
		
	}

}
