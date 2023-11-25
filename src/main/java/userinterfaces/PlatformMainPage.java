package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PlatformMainPage extends PageObject {
    public static final Target ADMIN_BUTTON = Target.the("ADMIN BUTTON").locatedBy("//*[@id=\"__next\"]/main/div/div/button[2]");
}
