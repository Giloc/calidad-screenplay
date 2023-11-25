package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.PlatformMainPage.ADMIN_BUTTON;

public class EnterAsAdminInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ADMIN_BUTTON));
    }

    public static EnterAsAdminInteraction enterAsAdmin(){
        return Tasks.instrumented(EnterAsAdminInteraction.class);
    }
}
