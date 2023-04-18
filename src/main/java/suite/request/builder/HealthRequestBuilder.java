package suite.request.builder;

import suite.request.route.Endpoint;
import suite.core.request.builder.RequestBuilder;

public class HealthRequestBuilder {

    public RequestBuilder buildRequest() {
        return RequestBuilder.builder().endpoint(Endpoint.HEALTH).build();
    }

}
