package stepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	ChromeDriver dr;
	
	@Before
	public void setUp()
	{
		dr=new ChromeDriver();
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    dr.get("https://www.facebook.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	   
		dr.findElement(By.name("email")).sendKeys("abc@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("abc123");
	}

	@And("click button")
	public void click_button() {
	    dr.findElement(By.name("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   Assert.assertEquals(dr.getCurrentUrl(),"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzI4OTkwMDcyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next", "invalid login");
	}



	

}
