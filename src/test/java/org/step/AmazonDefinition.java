package org.step;

import org.fbloginpojo.AmazonLogin;
import org.junit.Assert;
import org.lib.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDefinition extends BaseClass {
	static public AmazonLogin a;

	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
		// browserLaunch();
		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		maxWin();
	}

	@When("pass the value in emailfied")
	public void pass_the_value_in_emailfied() {
		a = new AmazonLogin();
		fillText(a.getTextEmail(), "8524046025");

	}

	@When("click the continue button")
	public void click_the_continue_button() {
		a = new AmazonLogin();
		btnClick(a.getConBtn());
	}

	@When("pass the value in passwordfied")
	public void pass_the_value_in_passwordfied() {
		a = new AmazonLogin();
		fillText(a.getTextPass(), "1111111");
	}

	@When("click singin button")
	public void click_singin_button() {
		a = new AmazonLogin();
		btnClick(a.getSignInBtn());
	}

	@Then("close the chrome browser")
	public void close_the_chrome_browser() {
		browserClose();
	}

	@Given("To Launch the  browser")
	public void to_Launch_the_browser() {
		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		maxWin();
	}

	@When("To pass the value in emailfied or phno")
	public void to_pass_the_value_in_emailfied_or_phno() {
		a = new AmazonLogin();
		fillText(a.getTextEmail(), "8524046025");
	}

	@When("To click the continue btn")
	public void to_click_the_continue_btn() {
		a = new AmazonLogin();
		btnClick(a.getConBtn());
	}

	@When("To pass the value in password field")
	public void to_pass_the_value_in_password_field() {
		a = new AmazonLogin();
		fillText(a.getTextPass(), "222222222");
		Assert.assertTrue(false);
	}

	@When("To click sing in button")
	public void to_click_sing_in_button() {
		a = new AmazonLogin();
		btnClick(a.getSignInBtn());
	}

	@Then("To close the  browser")
	public void to_close_the_browser() {
		browserClose();
	}

}
