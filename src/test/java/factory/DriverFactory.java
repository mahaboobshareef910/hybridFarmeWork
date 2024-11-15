package factory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utilites.CommonUtils;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("edge")) {
			
			driver = new EdgeDriver();
			
		}else if(browserName.equals("safari")) {
			
			driver = new SafariDriver();
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
		
	}

}
