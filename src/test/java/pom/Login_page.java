package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Login_page extends Baseclass{
	WebDriver driver;
	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='Name']") 
	private WebElement username;
	@FindBy (xpath = "//form[@action='/signup']//input[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//button[text()='Signup']")
    private WebElement singupbutton;
	
	public void userName(String s) {
		entervalue(username, s);
	}
	public void email(String s) {
		entervalue(email, s);

	}
	public void signup() {
	enterbutton(singupbutton);
	}
	
}
