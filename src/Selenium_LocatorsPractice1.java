import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_LocatorsPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking browser
		WebDriver driver = new ChromeDriver();
		
		//Adding Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Hitting url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Locating Username element and passing value - id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Sherinminta Jose");
		
		//Locating Password element and passing the value - name locator
		driver.findElement(By.name("inputPassword")).sendKeys("Sherin123");
		
		//Locating Submit button and clicking on it - classname locator
		driver.findElement(By.className("signInBtn")).click();
		
		//Capture the error message
		driver.findElement(By.cssSelector("p.error")).getText();
		
		//Print the error message
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Click on forgot password - linktext locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Adding wait - Page is in transition state
		Thread.sleep(1000);
		
		//Locate Name and pass value - xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sherinminta");
		
		//clear the text entered - css selector locator
		driver.findElement(By.cssSelector("input[placeholder='Name']")).clear();
		
		//Pass the value for Email again - indexing - css selector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("Sherinminta Jose");
		
		//Locate Email and pass value 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sherin123@gmail.com");
		
		//clear the text entered
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//Pass the value for Email again - indexing - xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("sherin@gmail.com");
		
		//Locate phone number - Parent Child tags - xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9898989898");
		
		//Locate Reset login button - css selector - .classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Grab the text and print it - Parent Child tags - css selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//Locate go to login button - 
		//Locate username - css selector - tagname#id
		//Locate password - xpath - regular expression
		//select checkbox - id locator
		//Locate submit button - css selector - regular expression
		
		//close the browser
		//driver.quit();
		
	}

}
