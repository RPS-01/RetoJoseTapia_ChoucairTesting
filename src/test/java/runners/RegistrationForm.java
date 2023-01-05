package runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Registration.feature", glue = "steps")

//Main runner class
public class RegistrationForm {

}
