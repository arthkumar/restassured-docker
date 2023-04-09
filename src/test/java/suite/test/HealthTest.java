package suite.test;

import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import suite.base.TestBase;
import suite.client.HealthClient;
import suite.core.request.builder.RequestBuilder;
import suite.dataprovider.TestDP;

/**
 * @author arth
 */
public class HealthTest extends TestBase {

    @Test(
            dataProviderClass = TestDP.class,
            dataProvider = "healthDP",
            description = "Verify that the service returns okay response when user makes a health request." +
                    "Verify that true is returned when when user makes a health request."
    )
    public void verifyHealth(RequestBuilder healthRequest, ResponseSpecification responseSpecification) {
        new HealthClient().makeHealthRequest(healthRequest).then().assertThat().spec(responseSpecification);
    }
}
