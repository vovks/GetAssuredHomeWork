import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class postTest {

    @Test
    public void checkPostStatusCode(){
        String JSON_STRING = "{\n" +
                "    \"apiKey\": \"f0a8ed3fd5f618970de71afbc1d9828c\",\n" +
                "    \"modelName\": \"TrackingDocument\",\n" +
                "    \"calledMethod\": \"getStatusDocuments\",\n" +
                "    \"methodProperties\": {\n" +
                "        \"Documents\": [\n" +
                "            {\n" +
                "                \"DocumentNumber\": \"59000683504223\",\n" +
                "                \"Phone\":\"\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "    \n" +
                "}";

        given().baseUri("https://api.novaposhta.ua")
                .basePath("v2.0/json/")
                .body(JSON_STRING)
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200);
    }
}
