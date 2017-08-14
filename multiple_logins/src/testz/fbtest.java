package testz;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objects.login;
import resources.browserprop;
import resources.exceldrivin;

public class fbtest extends browserprop {
	
	@Test
	public void loginp() throws Exception {
		
		prop();
		
		Logger log= Logger.getLogger("fbtest");
        PropertyConfigurator.configure("log4j.properties");
        log.info("logger created Sucessfully");
        log.info("browser got opened");
         
		
        login l=new login(driver);
        log.info("login class imported from objets");
		
		exceldrivin ed=new exceldrivin();
		log.info("exceldrivin class imported from resources");
		
		ArrayList<String> user=ed.getcelldata(0);
		ArrayList<String> pass=ed.getcelldata(1);
		log.info("data received from excel sheet");
		
		
		for (int i=0;i<user.size();i++) {
			
			l.username().sendKeys(user.get(i));
			log.info("Username entered");
			
			l.password().sendKeys(pass.get(i));
			log.info("password entered");
			
			l.go().click();
			log.info("login button clicked");
			
			l.fbhome().click();
			log.info("facebook home button clicked");
		}
		    log.info("browser closed");
	}
	@AfterMethod
	
	public void close() {
		
		driver.close();
		
	}

}
