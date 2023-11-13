package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDefinitios {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

    }
    @When("User enters valid credentials and clicks sign in")
    public void user_enters_valid_credentials_and_clicks_sign_in() {
    }
    @Then("User should be successfully logged in")
    public void user_should_be_successfully_logged_in() {
    }


    @When("User enters invalid credentials and clicks sign in")
    public void user_enters_invalid_credentials_and_clicks_sign_in() {
    }
    @Then("User should see an authentication failure message")
    public void user_should_see_an_authentication_failure_message() {
    }

    @Given("User is logged in")
    public void user_is_logged_in() {
    }
    @When("User clicks on the sign-out button")
    public void user_clicks_on_the_sign_out_button() {
    }
    @Then("User should be successfully logged out")
    public void user_should_be_successfully_logged_out() {
    }

}
