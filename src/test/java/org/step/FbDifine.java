package org.step;

import org.fbloginpojo.FbLogin;
import org.lib.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbDifine extends BaseClass {
	static public FbLogin l;

	@Given("To launch the chrome browser and hit the fb url")
	public void to_launch_the_chrome_browser_and_hit_the_fb_url() {
		//browserLaunch();
		launchUrl("https://www.facebook.com/");
		maxWin();
	}

	@When("To pass the value in emailfied")
	public void to_pass_the_value_in_emailfied() {
		l = new FbLogin();
		fillText(l.getTextEmail(), "ssssss");
	}

	@When("To pass the value in passwordfied")
	public void to_pass_the_value_in_passwordfied() {
		l = new FbLogin();
		fillText(l.getTextPass(), "1234");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		l = new FbLogin();
		btnClick(l.getLoginBtn());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		browserClose();
	}
}
