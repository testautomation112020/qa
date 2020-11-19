package pl.jsystems.qa.qaapi.service;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserService {

    public Response returnResponse(String host) {
        return RestAssured
                .given()
                .get(host)
                .andReturn();
    }
    //"http://www.mocky.io/v2/5a6a58222e0000d0377a7789"
}
