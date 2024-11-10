package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.CommonUtils;
import utilites.ElementUtils;

public class SignPageYahoo {
WebDriver driver;
private ElementUtils elementutils;
public SignPageYahoo(WebDriver driver) {
	this.driver=driver;
 PageFactory.initElements(driver,this);
   elementutils = new ElementUtils(driver);
}
@FindBy(xpath="//*[@name='username']")
private WebElement UserName;
public void Enter_UseremailField(String userEmail){
	elementutils.typeTextIntoElement(UserName,userEmail,CommonUtils.IMPLICIT_WAIT_TIME);
}
@FindBy(xpath="//*[@name='username']")
private WebElement UserPassword;
public void Enter_UserPasswordField(String userpswd){
	elementutils.typeTextIntoElement(UserPassword,userpswd,CommonUtils.IMPLICIT_WAIT_TIME);
}

}
