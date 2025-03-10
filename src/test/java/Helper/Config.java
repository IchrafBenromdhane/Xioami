package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Config {
	
	public static WebDriver driver;
	public static Actions actions;
	
	public static void confChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		driver = new ChromeDriver();
		actions = new Actions(driver);
	}
	
	public static void maximWindow () {
		
		driver.manage().window().maximize();
	}
	
	public static void attente( int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
		
	}
	
	public static void closeBrowser() {
		
		driver.quit();
		
	}
	
	

}
