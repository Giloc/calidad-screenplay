package tasks;

import interactions.AccessPartnerInfoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AccessPartnerInfoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AccessPartnerInfoInteraction.accessInfo());
    }

    public static AccessPartnerInfoTask accessInfo(){
        return Tasks.instrumented(AccessPartnerInfoTask.class);
    }
}
