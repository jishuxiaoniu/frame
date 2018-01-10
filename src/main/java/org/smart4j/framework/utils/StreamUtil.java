package org.smart4j.framework.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author duan
 * @Description: 流操作工具类
 * @Date: Created in 下午3:24 2018/1/10
 */
@Slf4j
public final class StreamUtil {

    /**
     * 从输入流中获取字符串
     *
     * @param inputStream
     * @return
     */
    public static String getString(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            log.error("get string failure", e);
            throw new RuntimeException(e);
        }

        return sb.toString();
    }
}
