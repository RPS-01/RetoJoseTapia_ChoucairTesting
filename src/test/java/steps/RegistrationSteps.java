package steps;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import tasks.RegistrationFormTasks;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

public class RegistrationSteps {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUpStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");

    }

    @Given("^User is on the home page$")
    public void user_is_on_the_home_page() {
        try {
            theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com"));
        } catch (Exception e) {
            System.out.print("Error when trying to open the page" + e);
            driver.close();
            driver.quit();
        }
    }

    @When("^the user clicks on the Join Today button$")
    public void user_clicks_on_register_button() {

        try {
            Thread.sleep(1000);
            theActorInTheSpotlight().attemptsTo(Click.on(locators.Home.REGISTER_LINK));
        } catch (Exception e) {
            System.out.println("Error when trying to click register button" + e);
            driver.close();
            driver.quit();
        }
    }

    @Then("^the user fills the registration form with valid data$")
    public void the_user_fills_the_registration_form_with_valid_data() {
        // Write code here that turns the phrase above into concrete actions
        try {
            Thread.sleep(1000);
            theActorInTheSpotlight().attemptsTo(RegistrationFormTasks.FillData());
        } catch (Exception e) {
            System.out.println("Error when trying to fill the form: \n" + e);
            Assert.fail();
            driver.close();
            driver.quit();
        }
    }

    @Then("^the user is redirected to a welcome page$")
    public void the_user_should_be_redirected_to_a_welcome_page() {
        try {
            locators.Registration.WELCOME_MESSAGE.resolveFor(theActorInTheSpotlight()).isVisible();
            System.out.println("User is redirected to welcome page, test passed");
        } catch(Exception e) {
            System.out.println("There was an error when trying to redirect to welcome page"+e);
            Assert.fail();
            driver.close();
            driver.quit();
        }

    }

    


}
