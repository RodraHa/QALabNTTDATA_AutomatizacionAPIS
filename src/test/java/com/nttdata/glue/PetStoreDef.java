package com.nttdata.glue;

import com.nttdata.steps.PetStoreStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PetStoreDef {

    @Steps
    PetStoreStep petStoreStep;

    @Given("la url del servicio {string}")
    public void laUrlDelServicio(String url) {
        PetStoreStep.setUrl(url);
    }

    @When("creo la order con id {string}, petId {string}, quantity {string}, shipDate {string}, status {string} y complete {string}")
    public void creoLaOrderConIdPetIdQuantityShipDateStatusYComplete(
            String id, String petId, String quantity, String shipDate, String status, String complete) {
        PetStoreStep.crearOrder(id, petId, quantity, shipDate, status, complete);
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int codigo) {
        PetStoreStep.validarCodigoRespuesta(codigo);
    }

    @And("obtengo un order con el formato especificado")
    public void obtengoUnOrderConElFormatoEspecificado() {
        PetStoreStep.validarEstructuraJson();
    }

    @When("consulto la order con id {string}")
    public void consultoLaOrderConId(String id) {
        PetStoreStep.consultarOrder(id);
    }
}
