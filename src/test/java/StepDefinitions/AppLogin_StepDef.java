package StepDefinitions;

import org.testng.Assert;

import com.qa.driverfactory.DriverFactory;
import com.qa.pages.LoginPage_POM;

import io.cucumber.java.en.*;

public class AppLogin_StepDef {

	LoginPage_POM loginpage = new LoginPage_POM(DriverFactory.getDriver());

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get("http://demo.guru99.com/V1/index.php");
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		loginpage.enter_username(username);
	}

	@And("User enters the password as {string}")
	public void user_enters_the_password_as(String password) {

		loginpage.enter_passwords(password);

	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		loginpage.click_login();
	}

	@SuppressWarnings("deprecation")
	@Then("User should be able login Sucessfully")
	public void user_should_be_able_login_sucessfully() {
		String title = DriverFactory.getDriver().getTitle();
		Assert.assertEquals(title," GTPL Bank Manager HomePage ");
	}
}
