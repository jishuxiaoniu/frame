package org.smart4j.framework.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author duan
 * @Description: 类型转换工具类
 * @Date: Created in 上午9:53 2018/1/10
 */
public class CastUtil {

    /**
     * 转换成string类型
     *
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }

    /**
     * 转换成string类型
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue) {
        return obj == null ? defaultValue : String.valueOf(obj);
    }

    /**
     * 转换成double类型
     *
     * @param obj
     * @return
     */
    public static double castDouble(Object obj) {
        return castDouble(obj, 0d);
    }

    /**
     * 转换成string类型
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String value = castString(obj);
            if (StringUtils.isNotEmpty(value)) {
                try {
                    defaultValue = Double.parseDouble(value);
                } catch (Exception e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转换成 long 类型
     *
     * @param obj
     * @return
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0L);
    }

    /**
     * 转换成 long 类型
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String value = castString(obj);
            if (StringUtils.isNotEmpty(value)) {
                try {
                    defaultValue = Long.parseLong(value);
                } catch (Exception e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转换成 int 类型
     *
     * @param obj
     * @return
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转换成string类型
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String value = castString(obj);
            if (StringUtils.isNotEmpty(value)) {
                try {
                    defaultValue = Integer.parseInt(value);
                } catch (Exception e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转换成 boolean 类型
     *
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转换成 boolean 类型
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            String value = castString(obj);
            if (StringUtils.isNotEmpty(value)) {
                try {
                    defaultValue = Boolean.parseBoolean(value);
                } catch (Exception e) {
                    booleanValue = defaultValue;
                }
            }
        }
        return booleanValue;
    }
}
