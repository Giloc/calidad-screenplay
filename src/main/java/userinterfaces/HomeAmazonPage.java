package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomeAmazonPage extends PageObject {
    public static final Target SEARCH_BAR = Target.the("SEARCH BAR").locatedBy("//*[@id=\"twotabsearchtextbox\"]");
    public static final Target LUPA = Target.the("LUPA").locatedBy("//*[@id=\"nav-search-submit-button\"]");
    public static final Target SEARCH_RESULT = Target.the("SEARCH RESULT").locatedBy("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]");
    public static final Target ITEM_TEXT = Target.the("ITEM TEXT").locatedBy("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]");
}
