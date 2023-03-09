import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Payload;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestManual {
    private static final String BASE_URL = "https://api.spacexdata.com/v3/payloads/";

    @Test
    @DisplayName("Апи тест написанный руками")
    public void testManual() {
        Payload firstPayloadInList = given()
                .when()
                .get(BASE_URL)
                .then()
                .log().all()
                .extract().body().jsonPath().getList("", Payload.class).get(0);

        Payload firstPayload = given()
                .when()
                .get(BASE_URL + firstPayloadInList.getPayload_id())
                .then()
                .log().all()
                .extract().body().as(Payload.class);

        assertEquals(firstPayload, firstPayloadInList);
    }
}
