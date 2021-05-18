import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class getTest {

    @Test
    public void checkGetStatusCode(){
        given().baseUri("https://www.metaweather.com/")
                .basePath("api/location/44418/")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
    }
}
