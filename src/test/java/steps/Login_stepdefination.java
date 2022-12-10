
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.LoginPage_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_stepdefination {
	
	WebDriver driver;
	commonActions ca;
	LoginPage_actions lpa;
	
	public Login_stepdefination (commonActions ca)
	{
		this.driver=ca.driver;
		lpa= new LoginPage_actions(ca);
	}

	@Given("User is on url {string}")
	public void user_enters_url(String str) 
	{
		driver.get(str);
	}
	@When("user enters login credentials as below")
	public void user_enters_login_credentials_as_below(DataTable data) throws InterruptedException 
	{	
			List<List<String>> d = data.asLists();
			lpa.enterEmail(d.get(1).get(1));
			lpa.enetrPasword(d.get(1).get(2));
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		lpa.clickSigninBtn();
	}

	@Then("validate User successfully logged in application")
	public void validate_user_successfully_logged_in_application() {
		String expCurrentUrl="https://admin-demo.nopcommerce.com/admin/";
		String actCurrentUrl=lpa.getCurrentUrl();
		Assert.assertEquals(actCurrentUrl, expCurrentUrl);
	}
	
	@Then("validate rememberme checkbox status")
	public void validate_rememberme_checkbox_status() {
	   boolean actStatus = lpa.verifycheckbox();
	   Assert.assertFalse(actStatus);
	}

	@When("user enters login credentials as {string} and {string}")
	public void user_enters_login_credentials_as_and(String str1, String str2) throws InterruptedException {
		lpa.enterEmail(str1);
		lpa.enetrPasword(str2);
		}
}
