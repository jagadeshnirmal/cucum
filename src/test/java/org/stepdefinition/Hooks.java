package org.stepdefinition;

import org.help.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {


public void bef() {
	launchBrowser();
	lanuchUrl("https://www.facebook.com/");

}
	public void aft() {
	closeTab();
	}
	@Before(order=2)
	public void bef2() {
			System.out.println("before tc2");

	}
	@Before(order=3)
	public void bef3() {
		System.out.println("before tc3");

	}
	@After(order=1)
	public void aft2() {
	System.out.println("After tc2");

	}
	@After(order=2)
	public void aft3() {
		System.out.println("After tc3");

	}
	
}
