package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ProductDetailPage.CART_AMOUNT;

public class CartAmountQuestion implements Question<Boolean> {
    private final String valAmount = "1";
    @Override
    public Boolean answeredBy(Actor actor) {
        String amount = Text.of(CART_AMOUNT).viewedBy(actor).asString();

        return amount.equals(valAmount);
    }

    public static CartAmountQuestion amount(){
        return new CartAmountQuestion();
    }
}
