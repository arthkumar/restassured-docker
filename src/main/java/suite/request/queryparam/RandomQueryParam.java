package suite.request.queryparam;

import java.util.HashMap;
import java.util.Map;

public class RandomQueryParam {

    private RandomQueryParam(){}

    public static Map<String, Object> getNullAuth() {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("auth", "null");
        return queryParam;
    }

}
