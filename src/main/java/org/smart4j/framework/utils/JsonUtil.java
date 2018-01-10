package org.smart4j.framework.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @Author duan
 * @Description: JSON 工具类
 * @Date: Created in 下午3:34 2018/1/10
 */
@Slf4j
public final class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 将 POJO 转换成 JSON
     *
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> String toJson(T obj) {
        String json;
        try {
            json = MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("convert POJO to JSON failure", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将 JSON 转换成 POJO
     *
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> type) {
        T pojo;
        try {
            pojo = MAPPER.readValue(json, type);
        } catch (IOException e) {
            log.error("convert JSON to POJO failure", e);
            throw new RuntimeException(e);
        }
        return pojo;
    }

}
