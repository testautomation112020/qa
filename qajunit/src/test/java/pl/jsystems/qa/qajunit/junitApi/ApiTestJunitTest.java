package pl.jsystems.qa.qajunit.junitApi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.jsystems.qa.qajunit.ConfigJunit;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Api test junit")
public class ApiTestJunitTest extends ConfigJunit {

    @Test
    public void sampleApiTEst() {
        assertTrue(true);
    }
}
