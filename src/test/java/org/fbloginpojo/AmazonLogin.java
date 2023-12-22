package org.fbloginpojo;

import org.lib.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin extends BaseClass {
	public AmazonLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")
	private WebElement textEmail;
	
	@FindBy(id="continue")
	private WebElement conBtn;
	
	@FindBy(name="password")
	private WebElement textPass;
	
	@FindBy(id="signInSubmit")
	private WebElement signInBtn;
	
	public WebElement getTextEmail() {
		return textEmail;
	}

	public WebElement getConBtn() {
		return conBtn;
	}

	public WebElement getTextPass() {
		return textPass;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	

}
