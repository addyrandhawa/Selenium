package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objects.signup;
import resources.exceldrive;
import resources.propertydrivin;

public class utest extends propertydrivin {
	
		
	
	@Test

	public void home() throws Exception {
		
		prop();
		
		Logger log=Logger.getLogger("utest");
		PropertyConfigurator.configure("log4j.properties");
		
		//Getting Data From Excel
		
		exceldrive d =new exceldrive();
		
		String firstname=exceldrive.getCelldata(0);
		String lastname=exceldrive.getCelldata(1);
		String email=exceldrive.getCelldata(2);
		String username=exceldrive.getCelldata(3);
		String password=exceldrive.getCelldata(4);
		String rpassword=exceldrive.getCelldata(4);
		
		
		//Filling The Signup Form
		
			
		signup s=new signup(driver);
		
		s.signlink().click();
		log.info("signup button clicked");
		
		s.Firstname().sendKeys(firstname);
		log.info("firstname filled");
		
		s.lastname().sendKeys(lastname);
		log.info("lastname filled");
		
		s.email().sendKeys(email);
		log.info("email filled");
		
		s.username().sendKeys(username);
		log.info("username filled");
		
		s.password().sendKeys(password);
		log.info("password filled");
		
		s.rpassword().sendKeys(rpassword);
		log.info("again password filled");
		
		//Actions a=new Actions(driver);
		WebElement ac=s.gender();
		//WebElement ml=s.male();
		//a.moveToElement(ac).build().perform();
		//a.moveToElement(ml).build().perform();*/
		/*
		Select sc=new Select(ac);
		sc.selectByIndex(0);
		log.info("gender selected");
		
		
		s.dob().sendKeys(dob);
		log.info("dob filled");
		
		s.zipcode().sendKeys(zipcode);
		log.info("zipcode filled");
		
		//s.country()
		
		//log.info("country selected");
		
		//s.tos()
		//log.info("tos marked");
		
		//s.captcha()
		//log.info("captcha filled ");
		
		s.nextbutton().click();
		log.info(" next button clicked");
		*/
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
}
