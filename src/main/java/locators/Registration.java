package locators;

import net.serenitybdd.screenplay.targets.Target;

public class Registration {

        /*Shared Components*/

        public static final Target SUBMIT = Target.the("Submit").locatedBy("//a[starts-with(@class, 'btn btn-blue')]");
        public static final Target BACK = Target.the("Back").locatedBy("//a[@class='btn btn-grey btn-rounded pull-left']");

        /* Step 1 components: Tell us about yourself */
        public static final Target FIRST_NAME = Target.the("First name").locatedBy("//input[@id='firstName']");

        public static final Target LAST_NAME = Target.the("Last name").locatedBy("//input[@id='lastName']");

        public static final Target EMAIL = Target.the("Email").locatedBy("//input[@id='email']");
        public static final Target DOB_MONTH = Target.the("Month").locatedBy("//select[@name='birthMonth']");
        public static final Target DOB_DAY = Target.the("Day").locatedBy("//select[@name='birthDay']");
        public static final Target DOB_YEAR = Target.the("Year").locatedBy("//select[@name='birthYear']");
        public static final Target LANGUAGES_BOX = Target.the("Languages Textbox").locatedBy("//input[@ng-model='$select.search']");
        public static final Target LANGUAGES_OPTIONS = Target.the("Languages Options").locatedBy("//span[@class='ui-select-choices-row-inner']");

        /* Step 2 Components: Add your address */
        public static final Target CITY = Target.the("City").locatedBy("//input[@id='city']");
        public static final Target CITY_OPTION = Target.the("City Option").locatedBy("//span[contains(text(),'DC, USA')]");
        public static final Target ZIP = Target.the("Zip code").locatedBy("//input[@id='zip']");
        public static final Target STATE = Target.the("State").locatedBy("//div[@class='ui-select-match']");
        public static final Target STATE_OPTIONS = Target.the("State Options").locatedBy("//div[@ng-bind-html='state.name | highlight: $select.search']");
        public static final Target COUNTRY = Target.the("Country").locatedBy("//select[@id='country']");

        /* Step 3 Components: Tell us about your devices */

        public static final Target COMPUTER = Target.the("Your Computer").locatedBy("//div[@on-select='getWebOSVersions()']");
        public static final Target VERSION = Target.the("Version").locatedBy("//span[@aria-label='Select a Version']");

        public static final Target LANGUAGE = Target.the("Language").locatedBy("//span[@aria-label='Select OS language']");
        public static final Target LANGUAGE_FIELD = Target.the("Language").locatedBy("//input[@placeholder='Select OS language']");
        public static final Target MOBILE = Target.the("Your Mobile").locatedBy("//div[@aria-label='Select Brand']");

        public static final Target MOBILE_FIELD = Target.the("Your Mobile").locatedBy("//input[@placeholder='Select Brand']");

        public static final Target MODEL = Target.the("Model").locatedBy("//span[@aria-label='Select a Model']");

        public static final Target MODEL_FIELD = Target.the("Model").locatedBy("//input[@placeholder='Select a Model']");

        public static final Target OS = Target.the("OS").locatedBy("//div[@name ='handsetOSId']");

        public static final Target OS_FIELD = Target.the("OS").locatedBy("//input[@aria-owns ='ui-select-choices-8']");


        /* Step 4 Components: Set up your password */

        public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@id='password']");
        public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").locatedBy("//input[@id='confirmPassword']");
        public static final Target STAY_INFORMED = Target.the("Stay Informed").locatedBy("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']");
        public static final Target TERMS = Target.the("Terms and Conditions").locatedBy("//label[a[contains(text(),'uTest Terms of Use')]]");
        public static final Target PRIVACY_POLICY = Target.the("Privacy and Security Policy").locatedBy("//label[a[contains(text(),'Privacy & Security Policy')]]");


        /*Step 5, confirmation messages*/
        public static final Target WELCOME_MESSAGE = Target.the("Terms and Conditions").locatedBy("//h1[contains(text(),'largest community of freelance software testers!')]");

}
