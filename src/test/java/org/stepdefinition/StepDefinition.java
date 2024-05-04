package org.stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.help.BaseClass;
import org.help.ForgottonPojo;
import org.help.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	ForgottonPojo li;
	LoginPojo l;

@Given("User have to lanuch the facebook application through chrome browser")
public void user_have_to_lanuch_the_facebook_application_through_chrome_browser() {
   launchBrowser();
   lanuchUrl("https://www.facebook.com/");
}



@When("User have to enter invalid email and valid password")
public void user_have_to_enter_invalid_email_and_valid_password(io.cucumber.datatable.DataTable d) {
 List<Map<String,String>> maps = d.asMaps(String.class, String.class);
 String mail = maps.get(2).get("pass");
 String pass = maps.get(1).get("email");
 
 l=new LoginPojo();
 WebElement email = l.getEmail();
 email.sendKeys(mail);
 WebElement password = l.getPassword();
 password.sendKeys(pass);
}

@When("User have to enter invalid email and invalid password")
public void user_have_to_enter_invalid_email_and_invalid_password(io.cucumber.datatable.DataTable d) {
 List<String> list = d.asList();
 String mail2 = list.get(2);
 String pass2 = list.get(3);

 l=new LoginPojo();
 
 WebElement email2 = l.getEmail();
 email2.sendKeys(mail2);
 
 WebElement password2 = l.getPassword();
 password2.sendKeys(pass2);
 
	
	
}




@When("User have to click login button")
public void user_have_to_click_login_button() {
    WebElement login = l.getLogin();
    login.click();
}

@Then("User have to reach invalid credential page")
public void user_have_to_reach_invalid_credential_page() {
	
   String url = driver.getCurrentUrl();
   if (url.contains("privacy_mutation_token")) {
	System.out.println("invalid reached");
} else {
	
System.out.println("invalid page not reached");
}
}

@When("User have to click forgetton password")
public void user_have_to_click_forgetton_password() {
	li=new ForgottonPojo();
WebElement forgottonpass = li.getForgottonpass();
forgottonpass.click();

}


@Then("User have to click search button")
public void user_have_to_click_search_button() {
	 WebElement clicksubmit = li.getClicksubmit();
		
		clicksubmit.click();

}	

}


