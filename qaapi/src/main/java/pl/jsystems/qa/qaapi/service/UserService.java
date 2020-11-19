package pl.jsystems.qa.qaapi.service;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pl.jsystems.qa.qaapi.User;
import pl.jsystems.qa.qaapi.specification.Specification;

import java.util.List;

public class UserService extends Service {

    private static final String USERS_PATH = "/5a6a58222e0000d0377a7789";

    public static Response returnUserResponse() {
        return returnResponseGetV2();
    }

    public static List<User> getUsers() {
//        return returnResponseUnPack(USERS_PATH).getList("", User.class);
        return returnResponseGetV2UnPack().getList("", User.class);
    }

    private static JsonPath returnResponseGetV2UnPack() {
        return returnResponseGetV2().then().extract().body().jsonPath();
    }

    private static Response returnResponseGetV2() {
        return RestAssured
                .given()
                .spec(Specification.requestSpecificationV2())
                .get(USERS_PATH)
                .andReturn();
    }


}
