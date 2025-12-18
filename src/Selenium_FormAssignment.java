import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_FormAssignment {

	public static void main(String[] args) {

		//Initialize driver
		WebDriver driver = new ChromeDriver();
		
		//Hit the url
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Locate name and pass value
		driver.findElement(By.cssSelector(".form-control")).sendKeys("Sherinminta Jose");
		
		//Locate email and pass value
		driver.findElement(By.name("email")).sendKeys("sherin123@gmail.com");
		
		//Locate password and pass value
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sherin123");
		
		//Locate checkbox and check it
		driver.findElement(By.className("form-check-input")).click();
		
		//Locate dropdown and select female
		WebElement Sdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Sdropdown);
		dropdown.selectByIndex(1);
		
		//Locate student and select radio-button
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
		//Locate DOB and pass value
		driver.findElement(By.name("bday")).sendKeys("01-01-2001");
		
		//Click on submit button
		driver.findElement(By.className("btn-success")).click();
		
		//Locate success message and print it
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		
		
		

	

	}

}
