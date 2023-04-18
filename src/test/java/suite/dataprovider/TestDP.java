package suite.dataprovider;

import org.apache.http.HttpStatus;
import org.testng.annotations.DataProvider;
import suite.core.request.builder.RequestBuilder;
import suite.core.response.ResponseSpecs;
import suite.request.builder.EntriesRequestBuilder;
import suite.request.builder.HealthRequestBuilder;
import suite.request.builder.RandomRequestBuilder;

import static org.hamcrest.Matchers.*;

public class TestDP {

    private RequestBuilder requestBuilder;
    private final ResponseSpecs responseSpecs = new ResponseSpecs();

    @DataProvider(parallel = true)
    public Object[][] healthDP() {
        requestBuilder = new HealthRequestBuilder().buildRequest();
        return new Object[][]{
                {requestBuilder, responseSpecs.expectedResponseStatus(HttpStatus.SC_OK)},
                {requestBuilder, responseSpecs.expectedBodyContainsString(containsString("true"))}
        };
    }

    @DataProvider(parallel = true)
    public Object[][] entriesDP() {
        requestBuilder = new EntriesRequestBuilder().buildRequest();
        return new Object[][]{
                {requestBuilder, responseSpecs.expectedResponseStatus(HttpStatus.SC_OK)},
                {requestBuilder, responseSpecs.expectedBodyPathContains("count", is(1425))},
        };
    }

    @DataProvider()
    public Object[][] entriesDPWithParam() {
        requestBuilder = new EntriesRequestBuilder().buildRequestWithQueryParam();
        return new Object[][]{
                {requestBuilder, responseSpecs.expectedBodyPathContains("entries.size()", is(1333))}
        };
    }

    @DataProvider(parallel = true)
    public Object[][] randomDP() {
        requestBuilder = new RandomRequestBuilder().buildRequest();
        return new Object[][]{
                {requestBuilder, responseSpecs.expectedResponseStatus(HttpStatus.SC_OK)},
                {requestBuilder, responseSpecs.expectedBodyPathContains("count", is(1))},
        };
    }

    @DataProvider()
    public Object[][] randomDPWithParam() {
        requestBuilder = new RandomRequestBuilder().buildRequestWithQueryParam();
        return new Object[][]{
                {requestBuilder, responseSpecs.expectedBodyPathContains("Auth", emptyOrNullString())}
        };
    }

}
