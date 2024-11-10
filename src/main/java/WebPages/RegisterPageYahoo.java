package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.CommonUtils;
import utilites.ElementUtils;

public class RegisterPageYahoo {
   WebDriver driver;
   private ElementUtils elementutils;
  public RegisterPageYahoo(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  elementutils = new ElementUtils(driver);
  }
 @FindBy(xpath="//*[@name='firstName']")
 private WebElement Firstname_Field;
 public void enterFirstname(String firstname) {
	 elementutils.typeTextIntoElement(Firstname_Field,firstname,CommonUtils.IMPLICIT_WAIT_TIME);
 }
 @FindBy(xpath="//*[@name='lastName']")
 private WebElement Lastname_Field;
 public void enterLastname(String lastname) {
	 elementutils.typeTextIntoElement(Lastname_Field,lastname,CommonUtils.IMPLICIT_WAIT_TIME);
 }
 @FindBy(xpath="//*[@name='userId']")
 private WebElement Email_Field;
 public void enterEmail(String email) {
	 elementutils.typeTextIntoElement(Email_Field,email,CommonUtils.IMPLICIT_WAIT_TIME);
 }
 
 @FindBy(xpath="//*[@name='password']")
 private WebElement password_Field;
 public void enterPassword(String password) {
	 elementutils.typeTextIntoElement(password_Field,password,CommonUtils.IMPLICIT_WAIT_TIME);
 }
 
 @FindBy(xpath="//*[@name='mm']//child::option[7]")
 private WebElement DOB_Month;
 public void enterDobMonth(String date) {
	 elementutils.typeTextIntoElement(DOB_Date,date,CommonUtils.IMPLICIT_WAIT_TIME);
 }
 @FindBy(xpath="//*[@name='dd']")
 private WebElement DOB_Date;
 public void enterDobDate(String date) {
	 elementutils.typeTextIntoElement(DOB_Date,date,CommonUtils.IMPLICIT_WAIT_TIME);
 }
 
 @FindBy(xpath="//*[@name='yyyy']")
 private WebElement DOB_Year;
 public void enterDobYear(String DobYear) {
	 elementutils.typeTextIntoElement(DOB_Year,DobYear,CommonUtils.IMPLICIT_WAIT_TIME);
 } 
 @FindBy(xpath="//*[@name='signup']")
 private WebElement Submit;
 public VerficationPageYahoo ClickonNextbutton() {
	 elementutils.clickOnElement(Submit,CommonUtils.IMPLICIT_WAIT_TIME);
	return new VerficationPageYahoo(driver);
	 
 }
 
}
