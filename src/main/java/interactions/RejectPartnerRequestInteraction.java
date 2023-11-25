package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.RequestInfoPage.CONTINUE_BUTTON;
import static userinterfaces.RequestInfoPage.REJECT_BUTTON;

public class RejectPartnerRequestInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(REJECT_BUTTON));
        actor.attemptsTo(Click.on(CONTINUE_BUTTON));
    }

    public static RejectPartnerRequestInteraction rejectRequest(){
        return Tasks.instrumented(RejectPartnerRequestInteraction.class);
    }
}
