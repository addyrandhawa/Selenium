package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertydrivin {
	public static WebDriver driver;
	
	public void prop() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Gagan Randhawa\\eclipse-workspace\\Excel_Data\\src\\resources\\data.properties");
		prop.load(fis);
		
		 if (prop.getProperty("browser").equals("chrome"))
		    {
		    	System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		    	driver= new ChromeDriver();
		    	
		    }
		    else 
		      {
		    	  System.setProperty("webdriverdriver.gecko.driver", "c:/geckodriver.exe");
			    	driver= new FirefoxDriver();
		      }
		    
		    driver.get(prop.getProperty("url"));
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
}
