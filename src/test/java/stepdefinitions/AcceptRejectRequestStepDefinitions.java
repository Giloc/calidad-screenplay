package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
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
import questions.PartnerAcceptedQuestion;
import questions.PartnerRejectedQuestion;
import tasks.*;
import userinterfaces.PlatformMainPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.core.IsEqual.equalTo;

public class AcceptRejectRequestStepDefinitions {
    private Actor admin = Actor.named("Admin");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver driver;

    @Before
    public void preInit(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("que estoy en la pagina inicial de la plataforma")
    public void enterMainPage(){
        driver.manage().window().maximize();
        admin.can(BrowseTheWeb.with(driver));
        admin.attemptsTo(Open.browserOn(new PlatformMainPage()));
    }

    @When("entro como administrador a una solicitud pendiente")
    public void enterAsAdmin(){
        admin.attemptsTo(EnterAsAdminTask.enterAsAdmin());
        admin.attemptsTo(SeePartnerRequestsTaks.seeRequests());
        admin.attemptsTo(AccessPartnerInfoTask.accessInfo());
    }

    @Then("puedo aceptarla")
    public void acceptPartnerRequest(){
        admin.attemptsTo(AcceptPartnerRequestTask.acceptRequest());
        admin.should(seeThat(PartnerAcceptedQuestion.accepted(), equalTo(true)));
    }

    @Then("puedo rechazarla")
    public void rejectPartnerRequest(){
        admin.attemptsTo(RejectPartnerRequestTask.rejectRequest());
        admin.should(seeThat(PartnerRejectedQuestion.reject(), equalTo(true)));
    }
}
