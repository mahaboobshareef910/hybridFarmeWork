package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.CommonUtils;
import utilites.ElementUtils;

public class VerficationPageYahoo {
WebDriver driver;
private ElementUtils elementutils;
public VerficationPageYahoo(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	elementutils = new ElementUtils(driver);
}
@FindBy(xpath="//*[@name='phone']")
private WebElement PhoneNumber_Field;
public void EnterPhoneNumber(String phonenumber) {
	elementutils.typeTextIntoElement(PhoneNumber_Field,phonenumber,CommonUtils.IMPLICIT_WAIT_TIME);
}

@FindBy(xpath="//*[@id='reg-sms-button']")
private WebElement PhoneNumber_textmsg;
public void ClickOnPhoneNumberTextMsg() {
	elementutils.clickOnElement(PhoneNumber_textmsg,CommonUtils.IMPLICIT_WAIT_TIME);
}
//here automate captcha button 
 
@FindBy(xpath="//*[@class='recaptcha-checkbox-border']")
private WebElement Captcha_buttton;
public void ClickOnCaptchabutton() {
   elementutils.clickOnElement(Captcha_buttton,CommonUtils.IMPLICIT_WAIT_TIME);
}
@FindBy(xpath="//*[@type='submit']")
private WebElement VerifyCaptcha;
public void ClickOnVerifyCaptcha() {
	elementutils.clickOnElement(VerifyCaptcha,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
}
//after selecting captcha manaully select verify button here
//so here at least give 4 to 5 mints time to select captcha
//after this getting the code from text or whatsup
//once u get code then click on verify button
//after verify the code page will be on Account page success
//BEFORE THIS MANUALLY TYPE CODE
@FindBy(xpath="//*[@id='verify-code-button']")
private WebElement Verify_code;
public AccountSuccessYahooPage ClickOnVerifyCode() {
  elementutils.clickOnElement(Verify_code,CommonUtils.IMPLICIT_WAIT_TIME);
return new AccountSuccessYahooPage(driver);
}

}