package com.reto.sistecredito.app.stepsdefinitions;

import com.reto.sistecredito.app.models.Product;
import com.reto.sistecredito.app.questions.ValidateProduct;
import com.reto.sistecredito.app.tasks.AddProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AddProductStepDefinition {

    @When("^select product$")
    public void selectProduct(List<Product> products) {
        theActorInTheSpotlight().attemptsTo(AddProduct.inApp(products));
    }

    @Then("^you should see the (.*) in the cart$")
    public void youShouldSeeTheInTheCart(String nameProduct) {
        theActorInTheSpotlight().should(seeThat(ValidateProduct.inCart(),equalTo(nameProduct)));
    }

}
