package StepDefinitions;

import io.cucumber.java.en.*;

public class AppLogin_StepDef {

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("Print");
	}

	@When("User enters the {string}")
	public void user_enters_the(String string) {
		System.out.println("Print");
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		System.out.println("Print");
	}

	@Then("User should be able login Sucessfully")
	public void user_should_be_able_login_sucessfully() {
		System.out.println("Print");
	}
}
