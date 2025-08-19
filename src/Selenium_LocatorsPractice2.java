import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class Selenium_LocatorsPractice2 {
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		//Hitting url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Click on forgot password - linktext locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Adding wait - Page is in transition state
		Thread.sleep(1000);				
		
		//Locate Reset login button - css selector - .classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Grab the text and store it - Parent Child tags - css selector
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		//PasswordText = Please use temporary password 'rahulshettyacademy' to Login.
		
		//Split passwordText at '
		String[] passwordArray = passwordText.split("'");
		
		//Zeroth index = Please use temporary password 
		//First index = rahulshettyacademy' to Login.
		
		//Split first index again at '
		String password = passwordArray[1].split("'")[0];
		
		//Above line is equivalent to
		//String passwordArray2 = passwordArray[1].split("'");
		//String password = passwordArray2[0]
		
		//Zeroth index = rahulshettyacademy 
		//First index =  to Login.
		
		return password;
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking browser
		WebDriver driver = new ChromeDriver();
		
		//Adding Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Declaring name variable
		String name = "Sherinminta Jose";	
		
		//Calling method
		String password = getPassword(driver);
		
		//Locate go to login button - xpath and tags
		driver.findElement(By.xpath("//div[contains(@class,'forgot')]/button[1]")).click();
		
		//Adding wait - Page is in transition state
		Thread.sleep(1000);
		
		//Locate username - css selector - tagname#id
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		
		//Locate password - xpath - regular expression
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys(password);
		
		//Check the checkbox - id locator
		driver.findElement(By.id("chkboxTwo")).click();
		
		//Locate submit button - css selector - regular expression
		driver.findElement(By.cssSelector("button[class*='submit']")).click();	
				
	}

}

