package tasks;

import interactions.ClickOnProductInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeeProductDetailTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOnProductInteraction.click());
    }

    public static SeeProductDetailTask see(){
        return Tasks.instrumented(SeeProductDetailTask.class);
    }
}
