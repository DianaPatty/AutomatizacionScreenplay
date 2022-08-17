package reto_Diana_Patricia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/reto_aplicativo_StarSharp.feature",
        glue = "reto_Diana_Patricia.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerCreatingOfMetting {

}