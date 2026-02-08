package erp.hotel.oriana.template;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
class InfoResourceTest {

    @Test
    void infoEndpointWorks() {
        given()
          .when().get("/api/v1/info")
          .then()
             .statusCode(200)
             .body("time", notNullValue());
    }
}
