package pl.jsystems.qa.qaapi.service;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Service {

    public Response returnResponse(String host) {
        return RestAssured
                .given()
                .get(host)
                .andReturn();
    }
}
