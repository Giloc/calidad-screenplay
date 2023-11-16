package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.SearchResultPage.PRODUCT_DETAIL;

public class ProductDetailQuestion implements Question<Boolean> {
    private final String valText = "Sobre este";
    private final String enValText = "About this";
    @Override
    public Boolean answeredBy(Actor actor) {
        String txt = Text.of(PRODUCT_DETAIL).viewedBy(actor).asString();

        System.out.println(txt);
        return txt.contains(valText) || txt.contains(enValText);
    }

    public static ProductDetailQuestion validateProductDetail(){
        return new ProductDetailQuestion();
    }
}
