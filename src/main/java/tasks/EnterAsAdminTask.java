package tasks;

import interactions.EnterAsAdminInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterAsAdminTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterAsAdminInteraction.enterAsAdmin());
    }

    public static EnterAsAdminTask enterAsAdmin(){
        return Tasks.instrumented(EnterAsAdminTask.class);
    }
}
