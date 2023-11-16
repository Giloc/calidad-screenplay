package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.CartAmountQuestion;
import questions.ProductDetailQuestion;
import questions.SearchResultQuestion;
import tasks.AddToCartTask;
import tasks.SearchProductTask;
import tasks.SeeProductDetailTask;
import userinterfaces.ProductDetailPage;
import userinterfaces.HomeAmazonPage;
import userinterfaces.SearchResultPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.core.IsEqual.equalTo;

public class SearchProductsAmazonStepDefinition {
    private Actor buyer = Actor.named("Client");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver driver;

    @Before
    public void preInit(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("that I am on the main page of Amazon")
    public void enterMainPageAmazon(){
        driver.manage().window().maximize();
        buyer.can(BrowseTheWeb.with(driver));
    }

    @When("I type the name of a product")
    public void writeProductWord(){
        buyer.attemptsTo(SearchProductTask.search(new HomeAmazonPage()));
    }

    @Then("I can see and select related products in the results")
    public void seeProductResults(){
        buyer.should(seeThat(SearchResultQuestion.validateSearchResult(), equalTo(true)));
    }

    @Given("that I have searched for a product")
    public void seeResultPage(){
        driver.manage().window().maximize();
        buyer.can(BrowseTheWeb.with(driver));
        buyer.attemptsTo(Open.browserOn(new SearchResultPage()));
    }
    @When("I select one of the results")
    public void clickProduct(){
        buyer.attemptsTo(SeeProductDetailTask.see());
    }
    @Then("I can view the product specifications")
    public void seeProductDetails(){
        buyer.should(seeThat(ProductDetailQuestion.validateProductDetail(), equalTo(true)));
    }
    @Given("that I have opened a product")
    public void openProductPage(){
        driver.manage().window().maximize();
        buyer.can(BrowseTheWeb.with(driver));
        buyer.attemptsTo(Open.browserOn(new ProductDetailPage()));
    }
    @When("I add it to the shopping cart")
    public void clickOnAdd(){
        buyer.attemptsTo(AddToCartTask.addToCart());
    }
    @Then("the number of products in the cart increases")
    public void increaseCartAmount(){
        buyer.should(seeThat(CartAmountQuestion.amount(), equalTo(true)));
    }
}
