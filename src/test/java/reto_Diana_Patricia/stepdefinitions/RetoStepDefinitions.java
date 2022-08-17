package reto_Diana_Patricia.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto_Diana_Patricia.tasks.*;


public class RetoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Diana wants to schedule a meeting in the StarSharp application$")
    public void thatDianaWantsToScheduleAMeetingInTheStarSharpApplication() {
    OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.thePage(), (Login.onThePage())
    , NavegateMenuBusinessUnit.onTheMenu());


    }

    @When("^she creates a business unit in the StarSharp application$")
    public void sheCreatesABusinessUnitInTheStarSharpApplication() {
    OnStage.theActorCalled("Diana").wasAbleTo(CreateABusinessUnit.onTheBotton());
    }

    @Then("^she can find the meeting created$")
    public void sheCanFindTheMeetingCreated() {
        OnStage.theActorCalled("Diana").wasAbleTo(NavegateMenuMetting.onTheMenu(),
                CreateAMetting.onTheBotton(),
                MeetingValidationCreated.onTheBotton());

    }



}
