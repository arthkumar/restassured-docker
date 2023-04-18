package suite.test.base;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;
import suite.request.route.BaseURL;

import static io.restassured.RestAssured.baseURI;

public class TestBase {

    @BeforeClass
    public void setUp() {
        baseURI = BaseURL.UAT;
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

}
