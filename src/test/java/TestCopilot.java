import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Mission;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCopilot {
    public static final String BASE_URL = "https://api.spacexdata.com/v3/missions/";

    @Test
    @DisplayName("Апи тест написанный с помощью copilot")
    public void testCopilot() {
        Mission firstMissionInList = given()
                .when()
                .get(BASE_URL)
                .then()
                .log().all()
                .extract().body().jsonPath().getList("", Mission.class).get(0);

        Mission firstMission = given()
                .when()
                .get(BASE_URL + firstMissionInList.getMission_id())
                .then()
                .log().all()
                .extract().body().as(Mission.class);

        assertEquals(firstMission, firstMissionInList);
    }
}
