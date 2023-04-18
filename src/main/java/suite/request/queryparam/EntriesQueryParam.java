package suite.request.queryparam;

import java.util.HashMap;
import java.util.Map;

public class EntriesQueryParam {

    private EntriesQueryParam(){}

    public static Map<String, Object> getHttpsEnabled() {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("https", "true");
        return queryParam;
    }
}
