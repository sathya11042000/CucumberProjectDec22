package org.step;

import org.fbloginpojo.FbLogin;
import org.lib.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbPositiveAndNagativeDifine extends BaseClass{
	static public FbLogin l;
	@Given("Usr has To launch the chrome browser")
	public void usr_has_To_launch_the_chrome_browser() {
		//browserLaunch();
		launchUrl("https://www.facebook.com/");
		maxWin();
	}

	@When("User has To pass the value {string} in email field")
	public void user_has_To_pass_the_value_in_email_field(String string) {
		l = new FbLogin();
		fillText(l.getTextEmail(),string);
	}

	@When("User has To pass the value {string} in password field")
	public void user_has_To_pass_the_value_in_password_field(String string) {
		l = new FbLogin();
		fillText(l.getTextPass(), string);  
	}

	@When("User has To click the login button")
	public void user_has_To_click_the_login_button() {
		l = new FbLogin();
		btnClick(l.getLoginBtn()); 
	}

	@Then("User has To close the chrome browser")
	public void user_has_To_close_the_chrome_browser() {
		browserClose();
	}

}
