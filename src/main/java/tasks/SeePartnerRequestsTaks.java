package tasks;

import interactions.SeePartnerRequestInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeePartnerRequestsTaks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeePartnerRequestInteraction.seeRequests());
    }

    public static SeePartnerRequestsTaks seeRequests(){
        return Tasks.instrumented(SeePartnerRequestsTaks.class);
    }
}
