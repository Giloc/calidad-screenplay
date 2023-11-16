package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/s?k=LG+Tv&__mk_es_US=ÅMÅŽÕÑ&crid=M4IHX54FW103&sprefix=lg+tv%2Caps%2C170&ref=nb_sb_noss_1")
public class SearchResultPage extends PageObject {
    public static final Target PRODUCT = Target.the("PRODUCT").locatedBy("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");
    public static final Target PRODUCT_DETAIL = Target.the("PRODUCT DETAIL").locatedBy("//*[@id=\"feature-bullets\"]/h1");
}
