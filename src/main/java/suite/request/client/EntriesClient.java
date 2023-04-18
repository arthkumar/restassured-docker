package suite.request.client;

import io.restassured.response.Response;
import suite.core.request.builder.RequestBuilder;
import suite.core.request.processor.impl.GetRequestProcessor;

public class EntriesClient {
    public Response makeEntriesRequest(RequestBuilder requestBuilder) {
        return new GetRequestProcessor().process(requestBuilder);
    }

    public Response makeEntriesRequestWithParam(RequestBuilder requestBuilder) {
        return new GetRequestProcessor().processWithParam(requestBuilder);
    }
}
