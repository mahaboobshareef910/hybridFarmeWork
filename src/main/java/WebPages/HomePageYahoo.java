package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.CommonUtils;
import utilites.ElementUtils;

public class HomePageYahoo {
WebDriver driver;
private ElementUtils elementutils;
public HomePageYahoo(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	elementutils = new ElementUtils(driver);
	}

@FindBy(xpath="//*[@id='createacc']")
private WebElement CraeteAccount;
public void Clickon_CreateAccoun() {
	elementutils.clickOnElement(CraeteAccount,CommonUtils.IMPLICIT_WAIT_TIME);
}

}
