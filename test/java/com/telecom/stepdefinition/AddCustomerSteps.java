package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerePage;
import com.telecom.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends CommonActions {
	
	CommonActions ca = new CommonActions();
	AddCustomerePage ap = new AddCustomerePage();
	
	
    static WebDriver driver;
	@Given("User launches demo telecom application")
	public void user_launches_demo_telecom_application() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
		
	    ca.button(ap.getCustomerButton());
	}

	@When("User enter all the fields")
	public void user_enter_all_the_fields() {
		
	   ca.button(ap.getDoneButton());
	   ca.insertText(ap.getFirstName(), "Divakar");
	   ca.insertText(ap.getLastName(), "R");
	   ca.insertText(ap.getMail(), "divakar.r0610@gmail.com");
	   ca.insertText(ap.getAddress(), "Chennai");
	   ca.insertText(ap.getPhono(), "8682844259");
	   
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		
	ca.button(ap.getSubmitButton());
	   
	}

	@Then("User verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		 WebElement equal = driver.findElement(By.xpath("(//*//tr//td)[3]"));
		    System.out.println(equal.getText());
		    Assert.assertNotEquals(equal, "Please Note Down Your CustomerID");
		    
	}
	
	@When("User enter all the fields by one dim list concept")
	 public void user_enter_all_the_fields_by_one_dim_list_concept(DataTable dataTable) {
		List<String> data = dataTable.asList(String.class);
		
		   ca.button(ap.getDoneButton());
		   ca.insertText(ap.getFirstName(), data.get(0));
		   ca.insertText(ap.getLastName(), data.get(1));
		   ca.insertText(ap.getMail(), data.get(2));
		   ca.insertText(ap.getAddress(),data.get(3));
		   ca.insertText(ap.getPhono(), data.get(4));
		        
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
	@When("User enter all the fields {string},{string},{string},{string},{string}")
	public void user_enter_all_the_fields(String fname, String lname, String mail, String address, String phono){
		
		driver.findElement(By.xpath("//*[@for='done']")).click();
		   driver.findElement(By.id("fname")).sendKeys(fname);
		   driver.findElement(By.id("lname")).sendKeys(lname);
		   driver.findElement(By.id("email")).sendKeys(mail);
		   driver.findElement(By.name("addr")).sendKeys(address);
		   driver.findElement(By.id("telephoneno")).sendKeys(phono);
	    
	}


}
