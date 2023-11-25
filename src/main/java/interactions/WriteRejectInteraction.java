package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.RequestInfoPage.SEND_REJECT_BUTTON;
import static userinterfaces.RequestInfoPage.TEXT_AREA;

public class WriteRejectInteraction implements Interaction {
    private final String why = "Diversos motivos";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(why).into(TEXT_AREA));
        actor.attemptsTo(Click.on(SEND_REJECT_BUTTON));
    }

    public static WriteRejectInteraction writeWhy(){
        return Tasks.instrumented(WriteRejectInteraction.class);
    }
}
