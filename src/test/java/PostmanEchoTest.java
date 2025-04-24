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

    private static String simpleText = "good luck";

    @BeforeAll
    public static void setup() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://postman-echo.com")
                .build();

        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody("headers.host", equalTo("postman-echo.com"))
                .expectBody("headers.x-forwarded-proto", equalTo("http"))
                .expectBody("headers.accept", equalTo("*/*"))
                .expectBody("headers.connection", equalTo("close"))
                .expectBody("headers.x-forwarded-port", equalTo("443"))
                .expectBody("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
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
                .body("url", equalTo("http://postman-echo.com/get"));
    }

    @Test
    public void PostRawTextTest() {
        given()
                .spec(requestSpec)
                .contentType(ContentType.TEXT)
                .body(simpleText)
                .when()
                .post("/post")
                .then()
                .spec(responseSpec)
                .body("headers.content-length", equalTo(String.valueOf(simpleText.length())))
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("data", equalTo(simpleText))
                .body("url", equalTo("http://postman-echo.com/post"));
    }





}
