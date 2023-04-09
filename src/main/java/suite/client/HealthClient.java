package suite.client;

import io.restassured.response.Response;
import suite.core.request.builder.RequestBuilder;
import suite.core.request.processor.impl.GetRequestProcessor;

public class HealthClient {
    public Response makeHealthRequest(RequestBuilder requestBuilder) {
        return new GetRequestProcessor().process(requestBuilder);
    }
}
