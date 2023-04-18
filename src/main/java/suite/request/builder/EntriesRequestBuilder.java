package suite.request.builder;

import suite.core.request.builder.RequestBuilder;
import suite.request.route.Endpoint;
import suite.request.queryparam.EntriesQueryParam;

public class EntriesRequestBuilder {

    public RequestBuilder buildRequest() {
        return RequestBuilder.builder().endpoint(Endpoint.ENTRIES).build();
    }

    public RequestBuilder buildRequestWithQueryParam() {
        return RequestBuilder.builder().queryParam(EntriesQueryParam.getHttpsEnabled()).endpoint(Endpoint.ENTRIES).build();
    }

}
