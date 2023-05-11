package pl.kazimierczak.jakub.spring.learn.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HttpRequestDashboardControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void listView() {
        // Given


        // When
        String forObject = restTemplate.getForObject("http://localhost:" + port + "/dashboards", String.class);

        // Then
        Assertions.assertThat(forObject).contains("Dashboards List");

    }
}