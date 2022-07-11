package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
 
	 WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("https://www.youtube.com/watch?v=w4ClQO0FFQg&ab_channel=SonyMusicIndia");  
		
		driver.manage().window().maximize(); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
	        //options.addArguments("user-data-dir=C:\\Users\\admin\\AppData\\Local\\Google\\Chrome\\User Data");
		//options.addArguments("--start-maximized");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
	}		
	@AfterTest
	public void afterTest() {
		//driver.quit();			
	}		
}	
