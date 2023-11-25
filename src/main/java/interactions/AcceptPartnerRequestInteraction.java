package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.RequestInfoPage.ACCEPT_BUTTON;

public class AcceptPartnerRequestInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACCEPT_BUTTON));
    }

    public static AcceptPartnerRequestInteraction acceptRequest(){
        return Tasks.instrumented(AcceptPartnerRequestInteraction.class);
    }
}
