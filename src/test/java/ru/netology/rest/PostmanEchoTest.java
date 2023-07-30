package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void shouldReturnDataSent() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                // Выполняемые действия
                .when()
                .post("/post")
                //.get("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi_for_fail"));

    }
}
