package tasks;

import interactions.AddToCartInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddToCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AddToCartInteraction.addToCart());
    }

    public static AddToCartTask addToCart(){
        return Tasks.instrumented(AddToCartTask.class);
    }
}
