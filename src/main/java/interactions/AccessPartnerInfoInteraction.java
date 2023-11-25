package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.RequestsPage.INFO;

public class AccessPartnerInfoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INFO));
    }

    public static AccessPartnerInfoInteraction accessInfo(){
        return Tasks.instrumented(AccessPartnerInfoInteraction.class);
    }
}
