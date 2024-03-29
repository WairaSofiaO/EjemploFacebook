package co.com.accenture.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/iniciar_sesion.feature",
                glue = "src/test/java/com.accenture.automation/stepdefinitions",
                snippets = SnippetType.CAMELCASE
                )
public class iniciarSesionRunner {

}
