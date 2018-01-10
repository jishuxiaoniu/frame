package org.smart4j.framework.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author duan
 * @Description:
 * @Date: Created in 下午6:46 2018/1/9
 */
@Slf4j
public class PropsUtils {

    /**
     * 加载属性文件
     *
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = PropsUtils.class.getClassLoader().getResourceAsStream(fileName);

            if (inputStream == null)
                throw new FileNotFoundException(fileName + "file not found!");
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            log.error("load properties failure ", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    log.error("inputstream close failure ", e);
                }
            }
        }

        return properties;
    }

    /**
     * 获取字符串属性（默认为空串）
     *
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props, String key) {
        return getString(props, key, "");
    }

    /**
     * 获取字符串属性（有默认值）
     * @param props
     * @param key
     * @param defaulValue
     * @return
     */
    public static String getString(Properties props, String key, String defaulValue) {
        String value = defaulValue;
        if (props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取整数属性（默认为0）
     *
     * @param props
     * @param key
     * @return
     */
    public static int getInt(Properties props, String key) {
        return getInt(props, key, 0);
    }

    /**
     * 获取整数属性（有默认值）
     * @param props
     * @param key
     * @param defaulValue
     * @return
     */
    public static int getInt(Properties props, String key, int defaulValue) {
        int value = defaulValue;
        if (props.containsKey(key)) {
            value = CastUtil.castInt(props.getProperty(key), defaulValue);
        }
        return value;
    }

    /**
     * 获取布尔属性（默认为false）
     *
     * @param props
     * @param key
     * @return
     */
    public static boolean getBoolean(Properties props, String key) {
        return getBoolean(props, key, false);
    }

    /**
     * 获取布尔属性（有默认值）
     * @param props
     * @param key
     * @param defaulValue
     * @return
     */
    public static boolean getBoolean(Properties props, String key, boolean defaulValue) {
        boolean value = defaulValue;
        if (props.containsKey(key)) {
            value = CastUtil.castBoolean(props.getProperty(key), defaulValue);
        }
        return value;
    }
}
