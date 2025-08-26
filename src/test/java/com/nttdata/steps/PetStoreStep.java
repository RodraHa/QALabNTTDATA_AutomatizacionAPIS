package com.nttdata.steps;

import com.nttdata.model.Order;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.CoreMatchers.notNullValue;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PetStoreStep {
    private static String URL = null;

    public static void setUrl(String url) {
        URL = url;
    }

    public static void crearOrder(String id, String petId, String quantity, String shipDate, String status, String complete) {
        Order order = new Order(
                id, petId, quantity, shipDate, status, complete);

        SerenityRest.given()
                .contentType("application/json")
                .body(order)
                .when()
                .post(URL + "/order");
    }

    public static void validarCodigoRespuesta(int codigo) {
        restAssuredThat(response -> response.statusCode(codigo));
    }

    public static void validarEstructuraJson() {
        restAssuredThat(response ->
                response.body("id", notNullValue())
                        .body("petId", notNullValue())
                        .body("quantity", notNullValue())
                        .body("shipDate", notNullValue())
                        .body("status", notNullValue())
                        .body("complete", notNullValue()));
    }

    public static void consultarOrder(String id) {
        SerenityRest.given()
                .contentType("application/json")
                .when()
                .get(URL + "/order/" + id);
    }
}
