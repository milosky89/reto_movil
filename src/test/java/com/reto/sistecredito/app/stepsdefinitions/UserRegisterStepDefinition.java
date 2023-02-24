package com.reto.sistecredito.app.stepsdefinitions;

import com.reto.sistecredito.app.models.User;
import com.reto.sistecredito.app.questions.ValidateRegister;
import com.reto.sistecredito.app.tasks.UserRegister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class UserRegisterStepDefinition {

    @Given("^tha (.*) enters the Dafiti app$")
    public void thaCamiloEntersTheDafitiApp(String actor) {
       theActorCalled(actor).wasAbleTo();
    }
    @When("^enter your data correctly$")
    public void enterYourDataCorrectly(List<User> user) {
        theActorInTheSpotlight().attemptsTo(UserRegister.inApp(user));
    }
    @Then("^must see profile (.*)$")
    public void mustSeeProfile(String email) {
        theActorInTheSpotlight().should(seeThat(ValidateRegister.getText(),equalTo(email)));
    }
}
