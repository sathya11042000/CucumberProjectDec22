package org.fbloginpojo;

import org.lib.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin  extends BaseClass{
	
	public FbLogin() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement textEmail;
	
	@FindBy(id="pass")
	private WebElement textPass;

	@FindBy(name="login")
	private WebElement loginBtn;

	public WebElement getTextEmail() {
		return textEmail;
	}

	public WebElement getTextPass() {
		return textPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
