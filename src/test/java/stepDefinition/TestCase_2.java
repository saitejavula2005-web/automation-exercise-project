package stepDefinition;

import java.sql.DriverAction;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase_2 extends Baseclass{
	@When("Navigate to url {string}")
	public void navigate_to_url(String string) {
		driver.get(string);
		openapplication(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		String title = driver.getTitle();
		Assert.assertEquals("Automation Exercise", title);
	}

	@When("Click on Signup \\/ Login button")
	public void click_on_signup_login_button() {
		 driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
			WebElement login = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
			enterbutton(login);
	}

	@Then("conform  {string} is visible")
	public void conform_is_visible(String string) {
		String newUserText = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		Assert.assertEquals("New User Signup!", newUserText);
	}

	@When("Enter  email as {string}")
	public void enter_email_as(String string) {
		 driver.findElement(By.xpath("//form[@action='/signup']//input[@name='email']")).sendKeys(string);
				WebElement email = driver.findElement(By.xpath("//form[@action='/signup']//input[@name='email']"));
				entervalue(email, string);	}

	@When("enter the password as {string}")
	public void enter_the_password_as(String string) {
		driver.findElement(By.cssSelector("#password")).sendKeys(string);
	}

	@When("press  {string} button")
	public void press_button(String string) {
	   //driver.findElement(null)
	}

	@Then("conform text {string} is visible")
	public void conform_text_is_visible(String string) {
	    
	}

	@Then("conform  that {string} is visible")
	public void conform_that_is_visible(String string) {
	   
	}
	


}
