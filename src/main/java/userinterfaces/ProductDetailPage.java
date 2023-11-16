package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/-/es/32LQ630BPUA-Paquete-pulgadas-protección-mejorada/dp/B09VLG7CM7/ref=sr_1_3?__mk_es_US=ÅMÅŽÕÑ&crid=I4MZOZWZ7613&keywords=LG+Tv&qid=1700069176&sprefix=lg+tv%2Caps%2C135&sr=8-3")
public class ProductDetailPage extends PageObject {
    public static final Target ADD_TO_CART = Target.the("ADD TO CART").locatedBy("//*[@id=\"add-to-cart-button\"]");
    public static final Target GO_TO_CART = Target.the("GO TO CART").locatedBy("//*[@id=\"nav-cart-count-container\"]/span[2]");
    public static final Target CART_AMOUNT = Target.the("CART AMOUNT").locatedBy("//*[@id=\"nav-cart-count\"]");
}
