package pl.jsystems.qa.qamock;

import org.mockserver.client.MockServerClient;
import pl.jsystems.qa.qamock.configuration.MockConfig;

public class MockService {

    private static MockServerClient client = null;

    public static synchronized MockServerClient getClient() {
        if(client == null) {
            String host = MockConfig.HOST;
            Integer port = MockConfig.PORT;
            String path = MockConfig.PATH;
            client = new MockServerClient(host, port, path);
        }
        return client;
    }
}
