package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.CommonUtils;
import utilites.ElementUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
public void clickOnMyAccount() {
		
		elementUtils.clickOnElement(myAccountDropMenu,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	}
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
public LoginPage selectLoginOption() {
		
		elementUtils.clickOnElement(loginOption,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new LoginPage(driver);
		
		
	}
	
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	@FindBy(name="search")
	private WebElement searchBoxField;
	
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	private WebElement searchButton;
	
	
	
	
	
}

