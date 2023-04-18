package suite.test.service;

import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import suite.test.base.TestBase;
import suite.request.client.RandomClient;
import suite.core.request.builder.RequestBuilder;
import suite.dataprovider.TestDP;

/**
 * @author arth
 */
public class RandomTest extends TestBase {

    @Test(
            dataProviderClass = TestDP.class,
            dataProvider = "randomDP",
            description = "Verify that 1425 entry is returned when user makes a requests for a random entry."
    )
    public void verifyRandom(RequestBuilder requestBuilder, ResponseSpecification responseSpecification) {
        new RandomClient().makeRandomRequest(requestBuilder).then().assertThat().spec(responseSpecification);
    }

    @Test(
            dataProviderClass = TestDP.class,
            dataProvider = "randomDPWithParam",
            description = "Verify that empty or null string is returned when user makes a requests for a random entry with auth type as null."
    )
    public void verifyEntriesWithParams(RequestBuilder requestBuilder, ResponseSpecification responseSpecification) {
        new RandomClient().makeRandomRequestWithParam(requestBuilder).then().assertThat().spec(responseSpecification);
    }

}
