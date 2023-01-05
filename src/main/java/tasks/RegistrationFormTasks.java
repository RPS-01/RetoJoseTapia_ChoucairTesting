package tasks;


import locators.Registration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import locators.Registration.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrationFormTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(locators.Registration.FIRST_NAME),
                SendKeys.of("Jose").into(locators.Registration.FIRST_NAME),
                Click.on(locators.Registration.LAST_NAME),
                SendKeys.of("Tapia").into(locators.Registration.LAST_NAME),
                SendKeys.of("tapiajosedanieltest@gmail.com").into(locators.Registration.EMAIL),
                Click.on(locators.Registration.DOB_MONTH),
                SendKeys.of("May").into(locators.Registration.DOB_MONTH),
                Click.on(locators.Registration.DOB_DAY),
                SendKeys.of("10").into(locators.Registration.DOB_DAY),
                Click.on(locators.Registration.DOB_YEAR),
                SendKeys.of("1990").into(locators.Registration.DOB_YEAR),
                SendKeys.of("Spanish").into(locators.Registration.LANGUAGES_BOX).thenHit(Keys.ENTER),
                Click.on(locators.Registration.SUBMIT),
                Clear.field(Registration.CITY),
                SendKeys.of("Washington").into(Registration.CITY),
                Click.on(Registration.CITY_OPTION),
                Click.on(Registration.ZIP),
                SendKeys.of("20001").into(Registration.ZIP),
                Click.on(locators.Registration.SUBMIT),
                Click.on(Registration.LANGUAGE),
                SendKeys.of("Spanish").into(Registration.LANGUAGE_FIELD).thenHit(Keys.ENTER),
                Click.on(Registration.MOBILE),
                SendKeys.of("Samsung").into(Registration.MOBILE_FIELD).thenHit(Keys.ENTER),
                Click.on(Registration.MODEL),
                SendKeys.of("Galaxy S10").into(Registration.MODEL_FIELD).thenHit(Keys.ENTER),
                Click.on(Registration.OS),
                SendKeys.of("Android 12").into(Registration.OS_FIELD).thenHit(Keys.ENTER),
                Click.on(locators.Registration.SUBMIT),
                SendKeys.of("Choucairautomationtest123").into(Registration.PASSWORD),
                SendKeys.of("Choucairautomationtest123").into(Registration.CONFIRM_PASSWORD),
                Click.on(locators.Registration.TERMS),
                Click.on(locators.Registration.PRIVACY_POLICY),
                Click.on(locators.Registration.SUBMIT)
                );

    }

    public static RegistrationFormTasks FillData() {
        return instrumented(RegistrationFormTasks.class);
    }

}
