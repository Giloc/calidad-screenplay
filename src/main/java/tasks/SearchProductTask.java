package tasks;

import interactions.ClickOnSearchInteraction;
import interactions.WriteProductNameInteraction;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class SearchProductTask implements Task {
    private PageObject page;

    public SearchProductTask(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(WriteProductNameInteraction.write());
        actor.attemptsTo(ClickOnSearchInteraction.click());
    }

    public static SearchProductTask search(PageObject page){
        return Tasks.instrumented(SearchProductTask.class, page);
    }
}
