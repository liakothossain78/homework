package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Camera;
import pageObjectModel.Cow;
import pageObjectModel.Mobile;

public class Step_defs extends Base {
	
	Camera cm;
	Cow cw;
	Mobile mbl;
	@Given("I am in chromeBrowser")
	public void i_am_in_chromeBrowser() {
		setup();
		get("https://newyork.craigslist.org/");
	   
	}

	@When("I am in Craigslist landing page")
	public void i_am_in_Craigslist_landing_page() {
		System.out.println("null");         
		cm=new Camera(driver);
		
		cm.sendKey("camera"+Keys.ENTER);
		
		
	   //cm.sendKey("camera");
		
	 //  sendKey(By.id("query"), "camera"+Keys.ENTER);
	   
	}

	@Then("I can see the Craigslist logo")
	public void i_can_see_the_Craigslist_logo() {
	    
	}




}
