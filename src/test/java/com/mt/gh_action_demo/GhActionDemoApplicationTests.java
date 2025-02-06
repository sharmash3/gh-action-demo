package com.mt.gh_action_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GhActionDemoApplicationTests {

	@Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloWorld() {
        // Send a GET request to the root URL
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);

        // Assert that the response status is 200 OK
        assertEquals(HttpStatus.OK, response.getStatusCode());

        // Assert that the response body contains "Hello, World!"
        assertEquals("Hello, World!", response.getBody());
    }
}
