package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.HomeAmazonPage.SEARCH_BAR;

public class WriteProductNameInteraction implements Interaction {
    private final String product= "LG Tv";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(product).into(SEARCH_BAR));
    }

    public static WriteProductNameInteraction write(){
        return Tasks.instrumented(WriteProductNameInteraction.class);
    }
}
