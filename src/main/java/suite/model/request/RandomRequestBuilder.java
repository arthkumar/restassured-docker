package suite.model.request;

import suite.appdata.Endpoint;
import suite.core.request.builder.RequestBuilder;

import java.util.HashMap;
import java.util.Map;

public class RandomRequestBuilder {
    public RequestBuilder buildRequest() {
        return RequestBuilder.builder().endpoint(Endpoint.RANDOM).build();
    }

    public RequestBuilder buildRequestWithQueryParam() {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("auth", "null");
        return RequestBuilder.builder().queryParam(queryParam).endpoint(Endpoint.RANDOM).build();
    }
}
