package co.com.accenture.automation.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IniciarSesionStepDefinition {
    @Given ("^I login in Facebook with my acount$")
    public void iLoginInFacebookWithMyAcount() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException;
    }

    @When("^Intento entrar a mi perfil de facebook$")
    public void intentoEntrarAMiPerfilDeFacebook() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verifico sea mi nombre el que esté en mi perfil$")
    public void verificoSeaMiNombreElQueEstéEnMiPerfil() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
