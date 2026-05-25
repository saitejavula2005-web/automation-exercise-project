package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Account_created extends Baseclass {
	WebDriver driver;

	public Account_created(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-qa='continue-button']")
	private WebElement continues;

	public void continues() {
		enterbutton(continues);

	}

}
