package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import WebPages.AccountSuccessYahooPage;
import WebPages.HomePageYahoo;
import WebPages.RegisterPageYahoo;
import WebPages.VerficationPageYahoo;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import utilites.CommonUtils;


public class RegisterYahoo {
	 WebDriver driver;
	 private HomePageYahoo homepageyaho;
	 private RegisterPageYahoo registerPageyaho;
	 private VerficationPageYahoo verifyYahoo;
	 private AccountSuccessYahooPage accountsuccessyahoo;
	 private CommonUtils commonutils;
	
	@Given("user naviagtes to signUp  Account page")
	public void user_naviagtes_to_sign_up_account_page() {
	      driver = DriverFactory.getDriver();
	      homepageyaho = new HomePageYahoo(driver);
	      homepageyaho.Clickon_CreateAccoun();
	}

	@When("user enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
	   Map<String, String> datamap = dataTable.asMap(String.class,String.class);
	   registerPageyaho.enterFirstname(datamap.get("firstnames"));
	   registerPageyaho.enterLastname(datamap.get("lastname"));
	   registerPageyaho.enterEmail(datamap.get("email"));
	   registerPageyaho.enterPassword(datamap.get("password"));
	   registerPageyaho.enterDobMonth(datamap.get("DOBMonth"));
	   registerPageyaho.enterDobDate(datamap.get("DOBDate"));
	   registerPageyaho.enterDobYear(datamap.get("DOBYear"));
	   
	}

	@When("user clik on next button")
	public void user_clik_on_next_button() {
		verifyYahoo=registerPageyaho.ClickonNextbutton();
	}

	@When("user enters phoneNumber As {string}")
	public void user_enters_phone_number_as(String string) {
	    verifyYahoo.EnterPhoneNumber("9603205826");
	}

	@When("user clicks on Phonenumber Text")
	public void user_clicks_on_phonenumber_text() {
		verifyYahoo.ClickOnPhoneNumberTextMsg();
	    
	}

	@When("user clicks on Captcha button")
	public void user_clicks_on_captcha_button() {
	   verifyYahoo.ClickOnCaptchabutton();
	}

	@When("user clicks on Verify Captcha button")
	public void user_clicks_on_verify_captcha_button() {
	    verifyYahoo.ClickOnVerifyCaptcha();
	}

	@When("user clikcs on Verify Code text")
	public void user_clikcs_on_verify_code_text() {
		accountsuccessyahoo=verifyYahoo.ClickOnVerifyCode();
	}

	@When("user account should get successful welcome to Yahoo")
	public void user_account_should_get_successful_welcome_to_yahoo() {
		Assert.assertEquals("Welcome to Yahoo! You can use your new email address",accountsuccessyahoo.getPageHeading());
	}

	@When("user clikcs on Select CheckbBox")
	public void user_clikcs_on_select_checkb_box() {
		accountsuccessyahoo.ClikOnCheckbox();
	}

	@Then("user clikcs on Done button")
	public void user_clikcs_on_done_button() {
		accountsuccessyahoo.ClickOnDoneButton();
	}


}
