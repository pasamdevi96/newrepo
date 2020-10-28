package gitproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaTest {
	WebDriver driver;
	
	 @Test
	public void setUp() {
		
	    System.setProperty("webdriver.chrome.driver", "F:\\QA\\Drivers\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://www.google.com/");

	}

}
