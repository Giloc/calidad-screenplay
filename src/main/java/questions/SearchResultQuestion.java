package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.HomeAmazonPage.ITEM_TEXT;
import static userinterfaces.HomeAmazonPage.SEARCH_RESULT;

public class SearchResultQuestion implements Question<Boolean> {
    private final String resultText = "resultados para \"LG Tv\"";
    @Override
    public Boolean answeredBy(Actor actor) {
        String valText1 = Text.of(SEARCH_RESULT).viewedBy(actor).asString();
        String valText2 = Text.of(ITEM_TEXT).viewedBy(actor).asString();

        String fullText = valText1 + " " +  valText2;

        return fullText.contains(resultText);
    }

    public static SearchResultQuestion validateSearchResult(){
        return new SearchResultQuestion();
    }
}
