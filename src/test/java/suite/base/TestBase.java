package suite.base;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;
import suite.appdata.Endpoint;

import static io.restassured.RestAssured.baseURI;

public class TestBase {

    @BeforeClass
    public void setUp() {
        baseURI = Endpoint.BASE_URL;
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
