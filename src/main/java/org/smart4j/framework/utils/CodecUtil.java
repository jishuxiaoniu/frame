package org.smart4j.framework.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author duan
 * @Description: 编码与解码操作工具类
 * @Date: Created in 下午3:29 2018/1/10
 */
@Slf4j
public final class CodecUtil {

    /**
     * 将 URL 编码
     *
     * @param source
     * @return
     */
    public static String encodeURL(String source) {

        String target;
        try {
            target = URLEncoder.encode(source, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            log.error("encode failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }


    /**
     * 将 URL 解码
     *
     * @param source
     * @return
     */
    public static String decodeURL(String source) {
        String target;
        try {
            target = URLDecoder.decode(source, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            log.error("encode failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }
}
