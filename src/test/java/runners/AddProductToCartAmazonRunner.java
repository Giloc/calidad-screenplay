package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_products_to_cart_amazon.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AddProductToCartAmazonRunner {
}
