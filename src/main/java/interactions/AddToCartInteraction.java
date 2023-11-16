package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.ProductDetailPage.ADD_TO_CART;

public class AddToCartInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ADD_TO_CART));
    }

    public static AddToCartInteraction addToCart(){
        return Tasks.instrumented(AddToCartInteraction.class);
    }
}
