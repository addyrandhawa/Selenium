package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
	
	WebDriver driver;

	
	public signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath=".//*[@id='wrapperAll']/div[1]/div[2]/div/div/a[2]")
	WebElement signlink;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[2]/input")
	WebElement Firstname;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[3]/input")
	WebElement lastname;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[5]/input")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[6]/input")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[7]/input")
	WebElement rpassword;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[8]/div/div/span")
	WebElement gender;
	
	@FindBy(xpath=".//*[@id='ui-select-choices-row-6-1']/a/div")
	WebElement male;
	
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[9]/input")
	WebElement dob;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[10]/input")
	WebElement zipcode;
	
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[11]/div/div/span")
	WebElement country;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[13]/div/label")
	WebElement tos;
	
	
	@FindBy(xpath=".//*[@id='recaptcha-anchor']/div[5]")
	WebElement captcha;
	
	@FindBy(xpath=".//*[@id='mainContent']/div/div/div/div[1]/div[2]/form/div[15]/button")
	WebElement nextbutton;
	
	
	
	public WebElement signlink() {
		        return signlink;
		}
	public WebElement Firstname() {
        return Firstname;

}
	public WebElement lastname() {
        return lastname;
}
	public WebElement email() {
        return email;
}
	public WebElement username() {
        return username;
}
	public WebElement password() {
        return password;
}
	public WebElement rpassword() {
        return rpassword;
}
	public WebElement gender() {
        return gender;
}
	public WebElement male() {
        return male;
}
	public WebElement dob() {
        return dob;
}
	public WebElement zipcode() {
        return zipcode;
}
	public WebElement country() {
        return country;
}
	public WebElement tos() {
        return tos;
}
	public WebElement captcha() {
        return captcha;
}
	public WebElement nextbutton() {
        return nextbutton;
}
	
	

}
