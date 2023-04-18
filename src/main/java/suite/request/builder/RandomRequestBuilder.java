package suite.request.builder;

import suite.core.request.builder.RequestBuilder;
import suite.request.route.Endpoint;
import suite.request.queryparam.RandomQueryParam;

public class RandomRequestBuilder {

    public RequestBuilder buildRequest() {
        return RequestBuilder.builder().endpoint(Endpoint.RANDOM).build();
    }

    public RequestBuilder buildRequestWithQueryParam() {
        return RequestBuilder.builder().queryParam(RandomQueryParam.getNullAuth()).endpoint(Endpoint.RANDOM).build();
    }

}
