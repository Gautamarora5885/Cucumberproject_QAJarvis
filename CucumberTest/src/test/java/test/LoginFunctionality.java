package test;

import io.cucumber.java.en.*;

public class LoginFunctionality {
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside :user is on login page");

	    }

	@And("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside :user enter username and password");

	   }
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside :click on login button");

	   }

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
		System.out.println("Inside :user is navigate to the homepag");

	    }
}
