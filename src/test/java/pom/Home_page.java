package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Home_page extends Baseclass{
	WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=' Signup / Login']") 
	private WebElement singupbutton;
	public void clicksignup() {
		enterbutton(singupbutton);

	}
	@FindBy(xpath = "//a[text()=' Delete Account']")
	private WebElement deleted;
	public void deleted() {
		enterbutton(deleted);

	}
	
	

}
