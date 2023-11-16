package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.SearchResultPage.PRODUCT;

public class ClickOnProductInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCT));
    }

    public static ClickOnProductInteraction click(){
        return Tasks.instrumented(ClickOnProductInteraction.class);
    }
}
