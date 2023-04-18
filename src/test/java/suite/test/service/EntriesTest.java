package suite.test.service;

import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import suite.test.base.TestBase;
import suite.request.client.EntriesClient;
import suite.core.request.builder.RequestBuilder;
import suite.dataprovider.TestDP;

/**
 * @author arth
 */
public class EntriesTest extends TestBase {

    @Test(
            dataProviderClass = TestDP.class,
            dataProvider = "entriesDP",
            description = "Verify that there are 1425 entries are returned when user makes requests for entries."
    )
    public void verifyEntries(RequestBuilder entriesRequest, ResponseSpecification responseSpecification) {
        new EntriesClient().makeEntriesRequest(entriesRequest).then().assertThat().spec(responseSpecification);
    }


    @Test(
            dataProviderClass = TestDP.class,
            dataProvider = "entriesDPWithParam",
            description = "Verify that there are 1333 entries are returned when user makes requests for entries with https as true."
    )
    public void verifyEntriesWithParams(RequestBuilder entriesRequest, ResponseSpecification responseSpecification) {
        new EntriesClient().makeEntriesRequestWithParam(entriesRequest).then().assertThat().spec(responseSpecification);
    }
}
