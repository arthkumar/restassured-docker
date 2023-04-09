package suite.model.request;

import suite.appdata.Endpoint;
import suite.core.request.builder.RequestBuilder;

public class HealthRequestBuilder {
    public RequestBuilder buildRequest() {
        return RequestBuilder.builder().endpoint(Endpoint.HEALTH).build();
    }
}
