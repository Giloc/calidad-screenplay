package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.HomeAmazonPage.LUPA;

public class ClickOnSearchInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LUPA));
    }

    public static ClickOnSearchInteraction click(){
        return Tasks.instrumented(ClickOnSearchInteraction.class);
    }
}
