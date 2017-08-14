package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	WebDriver driver;
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement username;
	
	public WebElement username() {
		return username;
	}
	@FindBy(xpath=".//*[@id='pass']")
	WebElement password;
	
	public WebElement password() {
		return password;
	}
    @FindBy(xpath=".//*[@id='loginbutton']")
    WebElement go;
	
	public WebElement go() {
		return go;
	}
	
	@FindBy(xpath=".//*[@id='blueBarDOMInspector']/div/div[1]/div/div/h1/a/i")
	WebElement fbhome;
	
	public WebElement fbhome() {
		return fbhome;
	}
}

