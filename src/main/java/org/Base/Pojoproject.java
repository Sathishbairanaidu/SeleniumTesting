package org.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoproject extends BaseClass {
	public Pojoproject() {
		PageFactory.initElements(driver, this);

	}

	@FindAll({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@name='email']"),
			@FindBy(xpath = "//input[@aria-label='Email address or phone number']")})

	private WebElement varRef;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getVarRef() {
		return varRef;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
