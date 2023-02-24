package com.reto.sistecredito.app.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@CucumberOptions(
        features = {"src/test/resources/features"}
        ,tags = "@addProductSuccesful"
        ,glue = {"com.reto.sistecredito.app.stepsdefinitions"}
        ,snippets = CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}