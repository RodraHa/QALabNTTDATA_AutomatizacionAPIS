package com.nttdata.glue;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PetStoreDef {
    @Given("la url del servicio {string}")
    public void laUrlDelServicio(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("creo la order con id {string}, petId {string}, quantity {string}, shipDate {string}, status {string} y complete {string}")
    public void creoLaOrderConIdPetIdQuantityShipDateStatusYComplete(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("obtengo un order con el formato especificado")
    public void obtengoUnOrderConElFormatoEspecificado() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("consulto la order con id {string}")
    public void consultoLaOrderConId(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
