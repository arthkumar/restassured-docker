package suite.model.request;

import suite.appdata.Endpoint;
import suite.core.request.builder.RequestBuilder;

import java.util.HashMap;
import java.util.Map;

public class EntriesRequestBuilder {
    public RequestBuilder buildRequest() {
        return RequestBuilder.builder().endpoint(Endpoint.ENTRIES).build();
    }

    public RequestBuilder buildRequestWithQueryParam() {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("https", "true");
        return RequestBuilder.builder().queryParam(queryParam).endpoint(Endpoint.ENTRIES).build();
    }
}
