package tasks;


import interactions.RejectPartnerRequestInteraction;
import interactions.WriteRejectInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RejectPartnerRequestTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(RejectPartnerRequestInteraction.rejectRequest());
        actor.attemptsTo(WriteRejectInteraction.writeWhy());
    }

    public static RejectPartnerRequestTask rejectRequest(){
        return Tasks.instrumented(RejectPartnerRequestTask.class);
    }
}
