package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.CommonUtils;
import utilites.ElementUtils;

public class AccountSuccessYahooPage {
	WebDriver driver;
	private ElementUtils elementutils;
	public AccountSuccessYahooPage(WebDriver driver) {
		this.driver=driver;
	 PageFactory.initElements(driver,this);
	   elementutils = new ElementUtils(driver);
}
	@FindBy(xpath="//*[contains(text(),'Welcome to Yahoo! You can use your new email address')")
	private WebElement pageHeading;
	public String getPageHeading() {
		return elementutils.getTextFromElement(pageHeading,CommonUtils.PAGE_LOAD_TIME) ;
}
	//after AccountSuucesspage click on check box
	@FindBy(xpath="//*[@name='subscribed']")
	private WebElement SelectCheckbox;
	public void ClikOnCheckbox() {
		elementutils.clickOnElement(SelectCheckbox,CommonUtils.IMPLICIT_WAIT_TIME);
	}
	//final click on Done button
	@FindBy(xpath="//*[@type='submit']")
	private WebElement Donebutton;
	public void ClickOnDoneButton() {
		elementutils.clickOnElement(Donebutton,CommonUtils.IMPLICIT_WAIT_TIME);
	}
}