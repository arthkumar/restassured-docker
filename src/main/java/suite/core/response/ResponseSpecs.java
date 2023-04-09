package suite.core.response;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matcher;

public class ResponseSpecs {

    /**
     * @return response specification for get request
     * <p>
     * 1. Checks whether the request returns 200 status code or not.
     * 2. Checks whether the returned response is JSON or not.
     */
    public ResponseSpecification expectedResponseStatus(int httpStatus) {
        return new ResponseSpecBuilder().expectStatusCode(httpStatus).build();
    }

    public ResponseSpecification expectedBodyContainsString(Matcher matcher) {
        return new ResponseSpecBuilder().expectBody(matcher).build();
    }

    public ResponseSpecification expectedBodyPathContains(String path, Matcher matcher) {
        return new ResponseSpecBuilder().expectBody(path, matcher).build();
    }

}
