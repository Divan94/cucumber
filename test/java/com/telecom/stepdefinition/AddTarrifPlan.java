package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTarrifPlan {
	
	static WebDriver driver;
	
	@Given("User launches demo telecom application page")
	public void user_launches_demo_telecom_application_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("User should click on add tarrif plan button")
	public void user_should_click_on_add_tarrif_plan_button() {
		
		driver.findElement(By.xpath("//*[text()='Add Tariff Plan']")).click();
		
	}
	   
	@When("User enter all the fields in tarrif plan")
	public void user_enter_all_the_fields_in_tarrif_plan() {
	    
	driver.findElement(By.id("rental1")).sendKeys("2");
	driver.findElement(By.id("local_minutes")).sendKeys("200");
	driver.findElement(By.id("inter_minutes")).sendKeys("100");
	driver.findElement(By.id("sms_pack")).sendKeys("100");
	driver.findElement(By.id("minutes_charges")).sendKeys("1");
	driver.findElement(By.id("inter_charges")).sendKeys("5");
	driver.findElement(By.id("sms_charges")).sendKeys("1");
	}

	@When("User click on submit button in tarrif plan page")
	public void user_click_on_submit_button_in_tarrif_plan_page() {
	    
		driver.findElement(By.xpath("//*[@value='submit']")).click();
	}

	@Then("User verify tarrif added")
	public void user_verify_tarrif_added() {
		
		 WebElement tarrif = driver.findElement(By.xpath("//*[text()='Congratulation you add Tariff Plan']"));
		 String equal = tarrif.getText();
		    Assert.assertEquals(equal, "Congratulation you add Tariff Plan");
		    System.out.println("Congratulation you add Tariff Plan");

		    driver.quit();
	}




}
