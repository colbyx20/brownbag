package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MyApplicationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void indexShouldReturnHomePage() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("/", String.class);
        assertThat(response.getBody()).contains("Welcome to the Home Page");
    }

    @Test
    void userLoginShouldReturnLoginPage() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("/user-login", String.class);
        assertThat(response.getBody()).contains("User Login");
    }

    @Test
    void loginShouldReturnSuccessMessage() {
        LinkedMultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("username", "user123");
        requestParams.add("password", "password123");

        ResponseEntity<String> response = this.restTemplate.postForEntity("/login", requestParams, String.class);
        assertThat(response.getBody()).contains("Login successful!");
    }

    @Test
    void loginShouldReturnErrorMessage() {
        LinkedMultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("username", "invalid");
        requestParams.add("password", "invalid");

        ResponseEntity<String> response = this.restTemplate.postForEntity("/login", requestParams, String.class);
        assertThat(response.getBody()).contains("Invalid credentials. Please try again.");
    }
}







// package com.example;

// import static org.junit.Assert.*;
// import org.junit.Before;
// import org.junit.Test;
// import java.util.HashMap;

// public class AppTest {

//     private App app;

//     @Before
//     public void setUp() {
//         app = new App();
//     }

//     @Test
//     public void testRun() {
//         app.run();
//         HashMap<Integer, Data> mymap = app.mymap;

//         // Check if the map contains the expected keys
//         assertTrue(mymap.containsKey(1));
//         assertTrue(mymap.containsKey(2));

//         // Check if the map contains the expected values
//         assertEquals("Data{Id=1, user=name1}", mymap.get(1).toString());
//         assertEquals("Data{Id=2, user=name2}", mymap.get(2).toString());
//     }
// }
