package AppUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Utils
{
 
public static	WebDriver driver;
  public static String url ="http://webapp.qedgetech.com";
	
	@BeforeSuite
	public void LanchApp() 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
			
	}
	
	 @AfterSuite
	 public void Logout() 
	 {
		 
		driver.close(); 
		 
		
	}
    	
	
	

}
