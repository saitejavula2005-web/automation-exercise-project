package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Account_created;
import pom.Account_deleted;
import pom.Home_page;
import pom.Login_details;
import pom.Login_page;

public class TestCase extends Baseclass {
	Home_page hp;
	Login_page lp;
	Login_details ld;
	Account_created ac;
	Account_deleted ad;
	@Given("i should launch browser")
	public void i_should_launch_browser() {
		launchbrowser();
		hp=new Home_page(driver);
		lp=new Login_page(driver);
		ld=new Login_details(driver);
		ac=new Account_created(driver);
		ad=new Account_deleted(driver);
	}

	@When("i navigate to {string}")
	public void i_navigate_to(String string) {
		openapplication(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("check whether it  has been navigated")
	public void check_whether_it_has_been_navigated() {
		String title = driver.getTitle();
		Assert.assertEquals("Automation Exercise", title);
	}

	@When("i Click on Signup \\/ Login button")
	public void i_click_on_signup_login_button() {
		// driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	//	WebElement login = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
		//enterbutton(login);
		hp.clicksignup();
	}

	@Then("check whether it has been verified to new user singup")
	public void check_whether_it_has_been_verified_to_new_user_singup() {
		String newUserText = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		Assert.assertEquals("New User Signup!", newUserText);
	}

	@When("i enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(string);
		lp.userName(string);
	}

	@When("i enter the email as {string}")
	public void i_enter_the_email_as(String string) {
		// driver.findElement(By.xpath("//form[@action='/signup']//input[@name='email']")).sendKeys(string);
		//WebElement email = driver.findElement(By.xpath("//form[@action='/signup']//input[@name='email']"));
		//entervalue(email, string);
		lp.email(string);
	}

	@When("i Click Signup button")
	public void i_click_signup_button() {
//driver.findElement(By.xpath("//button[text()='Signup']")).click();
//		WebElement signupbutton = driver.findElement(By.xpath("//button[text()='Signup']"));
//		enterbutton(signupbutton);
		lp.signup();
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_enter_account_information_is_visible() {
		//boolean textVisible = driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
		Assert.assertTrue(ld.verifytext());
		
	}

	@When("i click the title mr")
	public void i_click_the_title_mr() {
		//driver.findElement(By.cssSelector("#id_gender1")).click();
		ld.radiobutton();
	}

	@When("i enter the password {string}")
	public void i_enter_the_password(String string) {
		//driver.findElement(By.cssSelector("#password")).sendKeys(string);
		ld.password(string);
	}

	@When("i enter the date of birth {string} ,{string}, {string}")
	public void i_enter_the_date_of_birth(String string, String string2, String string3) {
	WebElement day = driver.findElement(By.cssSelector("#days"));
	//Select sd =new Select(day);
	//sd.selectByVisibleText(string);
	//visibletext(day, string);
	ld.days(string);
	
	WebElement month = driver.findElement(By.cssSelector("#months"));
	//Select sd1=new Select(month);
	//sd1.selectByVisibleText(string2);
	//visibletext(month, string2);
	ld.months(string2);
	WebElement year = driver.findElement(By.cssSelector("#years"));
	//Select sd2=new Select(year);
	//sd2.selectByVisibleText(string3);
	visibletext(year, string3);
	ld.years(string3);
	}

	@When("Sign up for our newsletter click")
	public void sign_up_for_our_newsletter_click() {
WebElement checkbox1 = driver.findElement(By.cssSelector("#newsletter"));
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].click();", checkbox1);
ld.newsletters();
	}

	@When("i enter the first name as {string}")
	public void i_enter_the_first_name_as(String string) {
WebElement firstname = driver.findElement(By.cssSelector("#first_name"));
//entervalue(firstname, string);
ld.firstname(string);
	}

	@When("i enter the lastname as {string}")
	public void i_enter_the_lastname_as(String string) {
WebElement lastname = driver.findElement(By.cssSelector("#last_name"));
//entervalue(lastname, string);
ld.lastname(string);

	}

	@When("i enter the companyname as {string}")
	public void i_enter_the_companyname_as(String string) {
//driver.findElement(By.cssSelector("#company")).sendKeys(string);
		ld.company(string);
	}

	@When("i enter the adress1 as {string}")
	public void i_enter_the_adress1_as(String string) {
//driver.findElement(By.cssSelector("#address1")).sendKeys(string);
		ld.adress(string);
	}

	@When("i enter the adress2 as {string}")
	public void i_enter_the_adress2_as(String string) {
//driver.findElement(By.cssSelector("#address2")).sendKeys(string);
		ld.adress2(string);
	}

	@When("i enter the country as {string}")
	public void i_enter_the_country_as(String string) {
WebElement country = driver.findElement(By.cssSelector("#country"));
//Select sl = new Select(country);
//sl.selectByVisibleText(string);
ld.country(string);
	}

	@When("i enter the state as {string}")
	public void i_enter_the_state_as(String string) {
//driver.findElement(By.cssSelector("#state")).sendKeys(string);
		ld.state(string);
	}

	@When("i enter the city as {string}")
	public void i_enter_the_city_as(String string) {
//driver.findElement(By.cssSelector("#city")).sendKeys(string);
		ld.city(string);
	}

	@When("i enter the zipcode as {string}")
	public void i_enter_the_zipcode_as(String string) {
//driver.findElement(By.cssSelector("#zipcode")).sendKeys(string);
		ld.zipcode(string);
	}

	@When("i enter the mobile no as {string}")
	public void i_enter_the_mobile_no_as(String string) {
//driver.findElement(By.cssSelector("#mobile_number")).sendKeys(string);
		ld.mobileno(string);
	}

	@When("i Click Create Account button")
	public void i_click_create_account_button() {
//WebElement continueBTN = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].click();", continueBTN);
ld.create();

	}

	@When("Click Continue button")
	public void click_continue_button() {
		//WebElement q = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
	//	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait1.until(ExpectedConditions.visibilityOf(q));
		//q.click();
ac.continues();
	}


	@When("Click Delete Account button")
	public void click_delete_account_button() {
		//driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
		hp.deleted();

	}
	@Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
	public void verify_that_account_deleted_is_visible_and_click_continue_button() {
	   // WebElement continueBtn = driver.findElement(By.xpath("//a[text()='Continue']"));
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOf(continueBtn));
	    //continueBtn.click();
	    ad.continent();
	}
	

}
