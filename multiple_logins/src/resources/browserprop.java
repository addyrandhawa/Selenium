package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserprop {
	public static WebDriver driver;
	
	public void prop() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Gagan Randhawa\\eclipse-workspace\\multiple_logins\\src\\resources\\data.properties");
		prop.load(fis);
		
		 if (prop.getProperty("browser").contains("chrome"))
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
		    driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
        public void getscreenshot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("C:\\Users\\Gagan Randhawa\\eclipse-workspace\\multiple_logins\\.log\\"+result+"ss.png"));
			
	}
	
	
	
}
