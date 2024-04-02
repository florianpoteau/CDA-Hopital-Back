package co.simplon.cdahopitalback.TestIntegration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GetAllPatientsIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @SuppressWarnings("deprecation")
    @Test
    public void myTest() {
        // Envoie une requête GET vers l'endpoint "/patient"
        ResponseEntity<String> response = restTemplate.exchange("/patient", HttpMethod.GET, null, String.class);

        // Vérifie le statut de la réponse
        assertEquals(200, response.getStatusCodeValue());
    }
}
