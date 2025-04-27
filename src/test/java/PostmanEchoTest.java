import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @BeforeAll
    public static void setup() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://postman-echo.com")
                .build();

        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody("headers.host", equalTo("postman-echo.com"))
                .expectBody("headers.x-forwarded-proto", equalTo("https"))
                .expectBody("headers.accept", equalTo("*/*"))
                .expectBody("headers.connection", equalTo("close"))
                .expectBody("headers.x-forwarded-port", equalTo("443"))
                .expectBody("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/24)"))
                .build();
    }

    @Test
    public void getRequestTest() {
        given()
                .spec(requestSpec)
                .when()
                .get("/get")
                .then()
                .spec(responseSpec)
                .body("url", equalTo("https://postman-echo.com/get"));
    }

    @Test
    public void PostRawTextTest() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.TEXT)
                .body("good luck")
                .when()
                .post("/post")
                .then()
                .spec(responseSpec)
                .body("headers.content-length", equalTo(String.valueOf("good luck".length())))
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("data", equalTo("good luck"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void PostFormDataTest() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("key", "foo1")
                .formParam("value", "bar1")
                .formParam("type", "text")
                .when()
                .post("/post")
                .then()
                .spec(responseSpec)
                .body("form.name", equalTo("foo1"))
                .body("form.age", equalTo("bar1"))
                .body("form.text", equalTo("text"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.content-type", equalTo("application/x-www-form-urlencoded; charset=UTF-8"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void putRequestTest() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .spec(responseSpec)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.content-length", equalTo(String.valueOf("This is expected to be sent back as part of response body.".length())))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.content-type", equalTo("application/json"))
                .body("url", equalTo("https://postman-echo.com/put"));
    }
    @Test
    public void patchRequestTest() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .spec(responseSpec)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.content-length", equalTo(String.valueOf("This is expected to be sent back as part of response body.".length())))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.content-type", equalTo("application/json"))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }
    @Test
    public void deleteRequestTest() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .spec(responseSpec)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.content-length", equalTo(String.valueOf("This is expected to be sent back as part of response body.".length())))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.content-type", equalTo("application/json"))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}




