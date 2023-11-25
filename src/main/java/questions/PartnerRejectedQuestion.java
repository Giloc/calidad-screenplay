package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.RequestInfoPage.REJECT_TEXT;

public class PartnerRejectedQuestion implements Question<Boolean> {
    private final String rejectText = "Partner Rejected";
    @Override
    public Boolean answeredBy(Actor actor) {
        String response = Text.of(REJECT_TEXT).viewedBy(actor).asString();
        return response.equals(rejectText);
    }

    public static PartnerRejectedQuestion reject(){
        return new PartnerRejectedQuestion();
    }
}
