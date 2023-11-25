package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RequestsPage extends PageObject {
    public static final Target INFO = Target.the("INFO").locatedBy("//*[@id=\"__next\"]/section/div/div/div/div[2]/button");
}
