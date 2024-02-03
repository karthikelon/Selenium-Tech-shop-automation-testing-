package Stepdef;

import com.Generic.Driverutils;
import com.POM.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage lp=new LoginPage();
	@Given("Enter the Url")
	public void enter_the_url() {
	    Driverutils.getDriver().get("https://demowebshop.tricentis.com/login");
	}

	@When("Enter the valid Email and password <{string}> and <{string}>")
	public void enter_the_valid_email_and_password_and(String string1, String string2) {
	    lp.enterEmail(string1);
	    lp.enterPassword(string2);
	}

	@Then("Login Successfully")
	public void login_successfully() {
	  lp.clickLogin();  
	}

}
