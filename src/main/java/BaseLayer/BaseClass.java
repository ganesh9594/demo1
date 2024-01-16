package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	protected static Properties prop;
	protected static WebDriver driver;
	
	
	
	public BaseClass() {
		
		try
		{
			File f= new File (System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\Config.properties");
			FileInputStream FIS=new FileInputStream(f);
			prop=new Properties();
			prop.load(FIS);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void intialization (String BrowserName)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH\\Desktop\\crome driver\\chromedriver-win64\\chromedriver.exe");
		if (BrowserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("headless"))
		{
			ChromeOptions chromeoptions=new ChromeOptions();
			chromeoptions.addArguments("--headless");
			driver=new ChromeDriver(chromeoptions);
		}
		else if(BrowserName.equalsIgnoreCase("incognito"))
		{
			ChromeOptions chromeoptions=new ChromeOptions();
			chromeoptions.addArguments("--incognito");
			driver=new ChromeDriver(chromeoptions);
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		String url =prop.getProperty("url");
		
		driver.get(url);
		
		
		
	}


}
