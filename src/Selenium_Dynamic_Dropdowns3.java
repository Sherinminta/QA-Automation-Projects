import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Dynamic_Dropdowns3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Hitting URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//Locate Departure City dropdown
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		
		//Select Bangalore from dropdown
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		Thread.sleep(2000);
		
		//Select Chennai from dropdown
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		

	}

}
