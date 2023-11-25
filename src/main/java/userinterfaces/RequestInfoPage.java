package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RequestInfoPage extends PageObject {
    public static final Target ACCEPT_BUTTON = Target.the("ACCEPT BUTTON").locatedBy("//*[@id=\"__next\"]/div/section/div[2]/button[1]");
    public static final Target REJECT_BUTTON = Target.the("REJECT BUTTON").locatedBy("//*[@id=\"__next\"]/div/section/div[2]/button[2]");
    public static final Target CONTINUE_BUTTON = Target.the("CONTINUE BUTTON").locatedBy("/html/body/div[3]/div[3]/div[2]/button[1]");
    public static final Target TEXT_AREA = Target.the("TEXT AREA").locatedBy("/html/body/div[3]/div[3]/div[1]/div/div[2]/textarea[1]");
    public static final Target SEND_REJECT_BUTTON = Target.the("SEND REJECT BUTTON").locatedBy("/html/body/div[3]/div[3]/div[2]/button");
    public static final Target ACCEPT_TEXT = Target.the("ACCEPT TEXT").locatedBy("/html/body/div[3]/div[3]/div[1]/div/div");
    public static final Target REJECT_TEXT = Target.the("ACCEPT TEXT").locatedBy("/html/body/div[4]/div[3]/div[1]/div/div[1]");
}
