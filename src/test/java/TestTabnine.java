import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Dragon;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTabnine {
    private static final String BASE_URL = "https://api.spacexdata.com/v3/dragons/";

    @Test
    @DisplayName("Апи тест написанный с помощью tabnine")
    public void testTabnine() {
        Dragon firstDragonInList = given()
                .when()
                .get(BASE_URL)
                .then()
                .log().all()
                .extract().body().jsonPath().getList(".", Dragon.class).get(0);

        Dragon firstDragon = given()
                .when()
                .get(BASE_URL + firstDragonInList.getId())
                .then()
                .log().all()
                .extract().body().as(Dragon.class);

        assertEquals(firstDragon, firstDragonInList);
    }
}
