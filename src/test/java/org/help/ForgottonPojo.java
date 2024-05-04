package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottonPojo extends BaseClass {
	
	public ForgottonPojo() {
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgottonpass;
	
	@FindBy(id="identify_email")
private WebElement emailtextbox;
	
	@FindBy(id="did_submit")
	private WebElement clicksubmit;

	public WebElement getForgottonpass() {
		return forgottonpass;
	}

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getClicksubmit() {
		return clicksubmit;
	}
	
}
