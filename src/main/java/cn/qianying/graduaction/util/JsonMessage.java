package cn.qianying.graduaction.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * json响应信息
 * <p>
 * Created by qianhaibin on 2018/3/8.
 */
public class JsonMessage {
    private static Logger logger = LoggerFactory.getLogger(JsonMessage.class);
    private static final int ERROR_CODE = -1;
    private static final int SUCCESS_CODE = 0;
    private static Map<String, Object> jsonResult = new HashMap<>();

    private JsonMessage() {
        jsonResult.put("msg", "数据为空");
        jsonResult.put("code", ERROR_CODE);
    }

    /**
     * 成功响应信息
     *
     * @param obj
     * @return
     */
    public static String success(Object... obj) {
        jsonResult.put("code", SUCCESS_CODE);
        if (obj == null || obj.length <= 0) {
            jsonResult.put("msg", "数据为空");
            return JSON.toJSONString(jsonResult);
        }
        jsonResult.put("msg", "请求数据成功");
        for (int i = 0; i < obj.length; i += 2) {
            try {
                jsonResult.put(obj[i].toString(), obj[i + 1]);
            } catch (Exception e) {
                logger.error("json数据转化错误!", e);
            }
        }
        return JSON.toJSONString(jsonResult);
    }

    /**
     * 错误响应信息
     *
     * @param msg
     * @return
     */
    public static String error(String msg) {
        jsonResult.put("msg", msg);
        return JSON.toJSONString(jsonResult);
    }
}
