package com.telecom.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforescenario() {
		System.out.println("Before every scenario");

	}

	@After
	public void afterscenario() {
		System.out.println("After every scenario");

	}
}
