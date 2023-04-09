package suite.dataprovider;

import org.apache.http.HttpStatus;
import org.testng.annotations.DataProvider;
import suite.core.request.builder.RequestBuilder;
import suite.core.response.ResponseSpecs;
import suite.model.request.EntriesRequestBuilder;
import suite.model.request.HealthRequestBuilder;
import suite.model.request.RandomRequestBuilder;

import static org.hamcrest.Matchers.*;

public class TestDP {

    @DataProvider(parallel = true)
    public Object[][] healthDP() {
        RequestBuilder requestBuilder = new HealthRequestBuilder().buildRequest();
        return new Object[][]{
                {requestBuilder, new ResponseSpecs().expectedResponseStatus(HttpStatus.SC_OK)},
                {requestBuilder, new ResponseSpecs().expectedBodyContainsString(containsString("true"))}
        };
    }

    @DataProvider(parallel = true)
    public Object[][] entriesDP() {
        RequestBuilder requestBuilder = new EntriesRequestBuilder().buildRequest();
        return new Object[][]{
                {requestBuilder, new ResponseSpecs().expectedResponseStatus(HttpStatus.SC_OK)},
                {requestBuilder, new ResponseSpecs().expectedBodyPathContains("count", is(1425))},
        };
    }

    @DataProvider()
    public Object[][] entriesDPWithParam() {
        RequestBuilder requestBuilder = new EntriesRequestBuilder().buildRequestWithQueryParam();
        return new Object[][]{
                {requestBuilder, new ResponseSpecs().expectedBodyPathContains("entries.size()", is(1333))}
        };
    }

    @DataProvider(parallel = true)
    public Object[][] randomDP() {
        RequestBuilder requestBuilder = new RandomRequestBuilder().buildRequest();
        return new Object[][]{
                {requestBuilder, new ResponseSpecs().expectedResponseStatus(HttpStatus.SC_OK)},
                {requestBuilder, new ResponseSpecs().expectedBodyPathContains("count", is(1))},
        };
    }

    @DataProvider()
    public Object[][] randomDPWithParam() {
        RequestBuilder requestBuilder = new RandomRequestBuilder().buildRequestWithQueryParam();
        return new Object[][]{
                {requestBuilder, new ResponseSpecs().expectedBodyPathContains("Auth", emptyOrNullString())}
        };
    }
}
