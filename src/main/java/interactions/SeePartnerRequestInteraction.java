package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.AdminPage.REQUEST_BUTTON;

public class SeePartnerRequestInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(REQUEST_BUTTON));
    }

    public static SeePartnerRequestInteraction seeRequests(){
        return Tasks.instrumented(SeePartnerRequestInteraction.class);
    }
}
