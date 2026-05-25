package pom;

import java.awt.Taskbar.State;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Login_details extends Baseclass{
	WebDriver driver;
public Login_details(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

}
 @FindBy(xpath = "//b[text()='Enter Account Information']")
   private WebElement text;
 
 
 
 public boolean verifytext() {
	return textverify(text);
 }
 
 @FindBy(css = "#id_gender1")
	private WebElement mr;
 public void radiobutton() {
enterbutton(mr);

}
 @FindBy(css= "#password")
 private WebElement password;
 public void password(String s) {
	 entervalue(password,s);
}
 @FindBy(css = "#days")
 private WebElement days;
 public void days(String s) {
	 visibletext(days, s);

	 
	 
}
 @FindBy(css = "#months")
 private WebElement months;
 public void months(String s) {
  visibletext(months, s);

}
 @FindBy(css = "#years")
 private WebElement years;
 public void years(String s ) {
visibletext(years, s);
}
 @FindBy(css = "#newsletter")
 private WebElement newsletter;
 public  void newsletters() {
	 //enterbutton(newsletter);
	 jsClick(newsletter);
}
 @FindBy(css = "#first_name")
 private WebElement firstname;
 public void firstname(String s) {
 entervalue(firstname, s);
}
 @FindBy(css = "#last_name")
 private WebElement lastname;
 public void lastname(String s) {
	 entervalue(lastname, s);
}
 @FindBy(css = "#company")
 private WebElement company;
 public void company(String s ) {
	 entervalue(company, s);

}
 @FindBy(css ="#address1")
 private WebElement adress1;
 public void adress(String s) {
	entervalue(adress1, s);
}
 @FindBy(css = "#address2")
 private WebElement adress_2;
 public void adress2(String s) {
entervalue(adress_2, s);
}
 @FindBy(css = "#country")
 private WebElement countrys;
 public void country(String s) {
	visibletext(countrys, s);

}
 @FindBy(css = "#state")
 private WebElement states;
 public void state(String s) {
entervalue(states, s);
 }
 @FindBy(css = "#city")
 private WebElement citys;
 public void city(String s ) {
entervalue(citys, s);
 }
 @FindBy(css = "#zipcode")
 private WebElement zipcodes;
 public void zipcode(String s) {
entervalue(zipcodes, s);
}
 @FindBy(css = "#mobile_number")
 private WebElement mobileno;
 public void mobileno(String s) {
entervalue(mobileno, s);
}
 
 @FindBy(xpath = "//button[@data-qa='create-account']")
 private WebElement createac;
 public void create() {
//enterbutton(createac);
	 jsClick(createac);
}
 
 
 
 
 
 
 
 
}

