package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestData;
import co.com.utest.questions.Answer;
import co.com.utest.tasks.FillOutComplete;
import co.com.utest.tasks.FillOutDevice;
import co.com.utest.tasks.FillOutLocation;
import co.com.utest.tasks.FillOutPersonal;
import co.com.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class utestStepDefinition {
    public utestStepDefinition() {
    }

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Catalina wanst to register on Utest$")
    public void thanCatalinaWanstToRegisterOnUtest() {
        OnStage.theActorCalled("Catalina").wasAbleTo(OpenUp.thePage());
    }

    @When("^She fills in the registration form$")
    public void sheFillsInTheRegistrationForm(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutPersonal.thePage(utestData),
                                                    FillOutLocation.thePage(utestData),
                                                    FillOutDevice.thePage(utestData),
                                                    FillOutComplete.thePage(utestData));
    }

    @Then("^Registration is complete when the Complete Setup button is clicked$")
    public void registrationIsCompleteWhenTheCompleteSetupButtonIsClicked(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(((UtestData)utestData.get(0)).getStrCompleteSetup())));
    }
}
