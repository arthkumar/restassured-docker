package suite.core.request.processor;

import io.restassured.response.Response;
import suite.core.request.builder.RequestBuilder;

public interface IGetRequestProcessor extends RequestProcessor {
    Response processWithParam(RequestBuilder requestBuilder);
}
