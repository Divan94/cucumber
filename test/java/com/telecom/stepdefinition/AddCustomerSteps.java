package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	
    static WebDriver driver;
	@Given("User launches demo telecom application")
	public void user_launches_demo_telecom_application() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
		
	    driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]")).click();
	}

	@When("User enter all the fields")
	public void user_enter_all_the_fields() {
		
	   driver.findElement(By.xpath("//*[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys("Divakar");
	   driver.findElement(By.id("lname")).sendKeys("R");
	   driver.findElement(By.id("email")).sendKeys("divakar.r0610@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("Chennai");
	   driver.findElement(By.id("telephoneno")).sendKeys("8682844259");
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		
	driver.findElement(By.xpath("//*[@value='Submit']")).click();
	   
	}

	@Then("User verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		 WebElement equal = driver.findElement(By.xpath("(//*//tr//td)[3]"));
		    System.out.println(equal.getText());
		    Assert.assertNotEquals(equal, "Please Note Down Your CustomerID");
		    driver.quit();
	}
	
	@When("User enter all the fields by one dim list concept")
	 public void user_enter_all_the_fields_by_one_dim_list_concept(DataTable dataTable) {
		List<String> data = dataTable.asList(String.class);
		
		   driver.findElement(By.xpath("//*[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(data.get(0));
		   driver.findElement(By.id("lname")).sendKeys(data.get(1));
		   driver.findElement(By.id("email")).sendKeys(data.get(2));
		   driver.findElement(By.name("addr")).sendKeys(data.get(3));
		   driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
		        
		    }
	@When("User enter all the fields by one dim map concept")
	 public void user_enter_all_the_fields_by_one_dim_map_concepts(DataTable dataTable){
		
		Map<String,String> data = dataTable.asMap(String.class,String.class);
		
		   driver.findElement(By.xpath("//*[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
		   driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
		   driver.findElement(By.id("email")).sendKeys(data.get("mail"));
		   driver.findElement(By.name("addr")).sendKeys(data.get("address"));
		   driver.findElement(By.id("telephoneno")).sendKeys(data.get("phono"));
		        
		    }

}
