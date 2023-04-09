package suite.core.request.builder;

import io.restassured.http.Header;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class RequestBuilder {
    private Header header;
    private String endpoint;
    private RequestBody requestBody;
    private Map<String, Object> queryParam;
}
