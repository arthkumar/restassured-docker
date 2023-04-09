package suite.core.request.processor;

import io.restassured.response.Response;
import suite.core.request.builder.RequestBuilder;

public interface RequestProcessor {
    Response process(RequestBuilder request);
}
