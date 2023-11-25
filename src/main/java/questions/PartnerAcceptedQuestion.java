package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.RequestInfoPage.ACCEPT_TEXT;

public class PartnerAcceptedQuestion implements Question<Boolean> {
    private final String acceptedText = "Partner Accepted";
    @Override
    public Boolean answeredBy(Actor actor) {
        String response = Text.of(ACCEPT_TEXT).viewedBy(actor).asString();

        return response.equals(acceptedText);
    }

    public static PartnerAcceptedQuestion accepted(){
        return new PartnerAcceptedQuestion();
    }
}
