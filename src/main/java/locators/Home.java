package locators;

//import target from screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.Target;

public class Home {

    public static final Target REGISTER_LINK = Target.the("Contact link").locatedBy("//a[contains(text(),'Join Today') and (@class='unauthenticated-nav-bar__sign-up')]");

}
