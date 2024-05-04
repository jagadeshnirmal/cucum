package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
	
		PageFactory.initElements(driver,this);
}
	
	@FindAll({
@FindBy(id="emailid"),
	@FindBy(xpath="//input[@placeholder='Email address or phone number']")})


private WebElement email;
	
@FindBy(id="pass")
private WebElement password;

@FindBy(name="login")
private WebElement login;



public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}



}


