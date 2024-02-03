package Stepdef;

import com.Generic.Driverutils;
import com.POM.BookPage;
import com.POM.LoginPage;
import com.POM.afterloginmainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookModuleSteps {

	LoginPage lp=new LoginPage();
	@Given("Enter the Url of website")
	public void enter_the_url_of_website() {
		Driverutils.getDriver().get("https://demowebshop.tricentis.com/login");
	}

	@When("Enter valid Email and password <{string}> and <{string}>")
	public void enter_valid_email_and_password_and(String string1, String string2) {
		 lp.enterEmail(string1);
		 lp.enterPassword(string2);
	}

	@When("Log in Successfully")
	public void log_in_successfully() {
		 lp.clickLogin();
	}
	afterloginmainPage mp=new afterloginmainPage();
	@When("click on the book module")
	public void click_on_the_book_module() {
	   mp.clickbookmodule();
	}
	BookPage bp=new BookPage();
	@When("click on the add to cart for book1")
	public void click_on_the_add_to_cart_for_book1() {
	   bp.AddToCartbook1();
	}

	@When("click on add to cart for book2")
	public void click_on_add_to_cart_for_book2() {
		bp.AddToCartbook2();
	}

	@Then("logout from the website")
	public void logout_from_the_website() {
	    bp.logout();
	}

}
