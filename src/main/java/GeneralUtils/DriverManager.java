package GeneralUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(String browserRequired)
	{
		System.out.println("Browser is "+ browserRequired);
		
		if(browserRequired.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserRequired.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserRequired.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		//driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("Browser is launched and maximized");
		return driver;
	}
	
	public static void quitDriver()
	{
		driver.quit();
		System.out.println("Browser is closed");
	}

}

	