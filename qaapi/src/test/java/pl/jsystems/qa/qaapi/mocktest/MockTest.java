package pl.jsystems.qa.qaapi.mocktest;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.jsystems.qa.qaapi.model.usersdevice.SimpleUser;
import pl.jsystems.qa.qamock.ApiMock;
import static com.google.common.truth.Truth.assertThat;

@DisplayName("Mock tests")
public class MockTest {

    @DisplayName("Mock test")
    @Test
    public void mockTest() {

        SimpleUser user = new SimpleUser("Piotr", "Kowalski");

        try {
            ApiMock.apiMock(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        String path = "http://localhost:1080/api/v1/mockapi";

        SimpleUser userFromMock = RestAssured
                .given()
                .get(path)
                .andReturn()
                .then()
                .extract()
                .body()
                .jsonPath()
                .getObject("", SimpleUser.class);

        assertThat(userFromMock.name).isEqualTo("Piotr");
        assertThat(userFromMock.surname).isEqualTo("Kowalski");

    }

    /*
        public static Response returnResponse(String host) {
        return RestAssured
                .given()
                .get(host)
                .andReturn();
    }

    public static JsonPath returnResponseUnPack(String host) {
        return returnResponse(host).then().extract().body().jsonPath();
    }
    * */
}
