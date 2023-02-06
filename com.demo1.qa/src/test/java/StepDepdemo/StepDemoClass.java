package StepDepdemo;

import com.Actiondemo.HomepageActiondemo;
import com.Utilitydemo.Base_demo;
import com.Utilitydemo.ScreenShortsdemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDemoClass  extends Base_demo  {
	HomepageActiondemo homepageActiondemo = new HomepageActiondemo();
	
	@Given("^Open application <\"([^\"]*)\">$")
	public void open_application(String URL) throws Throwable {
		lunchURL(URL);
		ScreenShortsdemo.takeDemoScreenshot(driver, "Home Page");
	}
	@When("^Click on home page  link$")
	public void click_on_home_page_link() throws Throwable {
		homepageActiondemo.Clickonhomepagelink();
	}

	@Then("^Verify home page$")
	public void verify_home_page() throws Throwable {
		homepageActiondemo.Verifyhomepage();
	}

	@When("^Click on Contact link in Homepage$")
	public void click_on_Contact_link_in_Homepage() throws Throwable {
		homepageActiondemo.ClickonContactlinkinHomepage();
		Thread.sleep(2000);
	}

	@Then("^Verify Contact page is accessible to the user$")
	public void verify_Contact_page_is_accessible_to_the_user() throws Throwable {
	    ScreenShortsdemo.takeDemoScreenshot(driver, "Contact Page");
	    Thread.sleep(2000);
	}

	@When("^Click on About Us link in Homepage$")
	public void click_on_About_Us_link_in_Homepage() throws Throwable {
		homepageActiondemo.ClickonAboutUslinkinHomepage();
		Thread.sleep(2000);
	}

	@Then("^Verify About us  page is accessible to the user$")
	public void verify_About_us_page_is_accessible_to_the_user() throws Throwable {
		ScreenShortsdemo.takeDemoScreenshot(driver, "About us");
		Thread.sleep(2000);
	}

	@When("^Click on Cart link in Homepage$")
	public void click_on_Cart_link_in_Homepage() throws Throwable {
		homepageActiondemo.ClickonCartlinkinHomepage();
		Thread.sleep(2000);
	}

	@Then("^Verify Cart  page is accessible to the user$")
	public void verify_Cart_page_is_accessible_to_the_user() throws Throwable {
	   ScreenShortsdemo.takeDemoScreenshot(driver, "Cart page");
	   Thread.sleep(2000);
	}

	@When("^Click on Login link in Homepage$")
	public void click_on_Login_link_in_Homepage() throws Throwable {
		homepageActiondemo.ClickonLoginlinkinHomepage();
		Thread.sleep(2000);
	}

	@Then("^Verify Login  page is accessible to the user$")
	public void verify_Login_page_is_accessible_to_the_user() throws Throwable {
		 ScreenShortsdemo.takeDemoScreenshot(driver, "Login Page");
		 Thread.sleep(2000);
	}

	@When("^Click on Sign Up link in Homepage$")
	public void click_on_Sign_Up_link_in_Homepage() throws Throwable {
		homepageActiondemo.ClickonSignUplinkinHomepage();
		Thread.sleep(2000);
	}

	@Then("^Verify Sign Up  page is accessible to the user$")
	public void verify_Sign_Up_page_is_accessible_to_the_user() throws Throwable {
	    ScreenShortsdemo.takeDemoScreenshot(driver, "Sign up Page");
	   Thread.sleep(2000);
	}


}
