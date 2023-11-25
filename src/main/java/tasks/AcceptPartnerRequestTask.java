package tasks;

import interactions.AcceptPartnerRequestInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AcceptPartnerRequestTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AcceptPartnerRequestInteraction.acceptRequest());
    }

    public static AcceptPartnerRequestTask acceptRequest(){
        return Tasks.instrumented(AcceptPartnerRequestTask.class);
    }
}
