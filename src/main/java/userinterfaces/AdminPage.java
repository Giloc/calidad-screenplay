package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdminPage extends PageObject {
    public static final Target REQUEST_BUTTON = Target.the("REQUEST BUTTON").locatedBy("//*[@id=\"__next\"]/div/div[1]/a");
}
