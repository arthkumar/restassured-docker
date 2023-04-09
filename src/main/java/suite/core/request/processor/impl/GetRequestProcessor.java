package suite.core.request.processor.impl;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import suite.core.request.builder.RequestBuilder;
import suite.core.request.processor.IGetRequestProcessor;

public class GetRequestProcessor implements IGetRequestProcessor {

    @Override
    public Response process(RequestBuilder request) {
        return RestAssured.get(request.getEndpoint());
    }

    @Override
    public Response processWithParam(RequestBuilder requestBuilder) {
        return RestAssured.given().queryParams(requestBuilder.getQueryParam()).get(requestBuilder.getEndpoint());
    }
}
