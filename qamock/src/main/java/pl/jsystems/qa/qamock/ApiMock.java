package pl.jsystems.qa.qamock;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;

public class ApiMock {

    public static void apiMock(Object object) throws JsonProcessingException {

        HttpRequest request = new HttpRequest()
                .withPath("/api/v1/mockapi")
                .withMethod("GET");

        System.out.println("request: " + request.toString());

        HttpResponse response = new HttpResponse()
                .withStatusCode(200)
                .withBody(new ObjectMapper().writeValueAsString(object));

        System.out.println("response: " + response.toString());

        MockService.getClient()
                .when(request)
                .respond(response);

    }
}
