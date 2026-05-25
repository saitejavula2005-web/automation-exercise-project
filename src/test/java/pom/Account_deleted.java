package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Account_deleted extends Baseclass {
	WebDriver driver;
	public Account_deleted(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[text()='Continue']")
private WebElement continent;
 public void continent() {
	 explicitwaittt(continent);
	enterbutton(continent);
}
 
}
