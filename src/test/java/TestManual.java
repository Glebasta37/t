import org.junit.jupiter.api.Test;
import utils.Payload;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestManual {
    private final String BASE_URL = "https://api.spacexdata.com/v3/payloads/";

    @Test
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
