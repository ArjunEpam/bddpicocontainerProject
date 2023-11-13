package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utils.WebDriverManager;

public class RegistrationStepDefinitions {
    private WebDriverManager driverManager;
    RegistrationPage registrationPage;

    public RegistrationStepDefinitions(WebDriverManager driverManager) {
        this.driverManager = driverManager;
    }


    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() throws InterruptedException {
        registrationPage = new RegistrationPage(driverManager);
        Assert.assertTrue(registrationPage.regPage());
        Thread.sleep(5000);

    }
    @When("User enters valid registration details")
    public void user_enters_valid_registration_details() {

    }
    @When("User submits the registration form")
    public void user_submits_the_registration_form() {

    }
    @Then("User should see a confirmation message")
    public void user_should_see_a_confirmation_message() {

    }


    @When("User enters invalid registration details")
    public void user_enters_invalid_registration_details() {

    }

    @Then("User should see an error message")
    public void user_should_see_an_error_message() {

    }
}
