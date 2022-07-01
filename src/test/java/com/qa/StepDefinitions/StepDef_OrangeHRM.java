package com.qa.StepDefinitions;

import com.qa.ElementLocators.ElementLocators_OrangeHRMDemo;
import com.qa.PageFactory.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_OrangeHRM {
	
	@Given("I want to open webiste OrangeHRM")
	public void i_want_to_open_webiste_OrangeHRM() {
	   PageFactory.openbrowser("https://opensource-demo.orangehrmlive.com/");	
	    
	}
	@When("I want to send Username")
	public void i_want_to_send_Usernmae() {
	    PageFactory.Sendvalue("Admin", ElementLocators_OrangeHRMDemo.Username);
	    
	}

	@And("I want to send Password")
	public void i_want_to_send_Password() {
		PageFactory.Sendvalue("admin123", ElementLocators_OrangeHRMDemo.Password);
	}

	@Then("I click on submit button")
	public void i_click_on_submit_button() throws InterruptedException {
		PageFactory.clickmethod( ElementLocators_OrangeHRMDemo.submit); 
	}

}
