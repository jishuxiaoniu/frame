package org.smart4j.framework.helper;

import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.utils.PropsUtils;

import java.util.Properties;

/**
 * @Author duan
 * @Description: 属性文件助手类
 * @Date: Created in 下午6:45 2018/1/9
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropsUtils.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取 jdbc driver
     *
     * @return
     */
    public static String getJdbcDriver() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRVIER);
    }

    /**
     * 获取 jdbc url
     *
     * @return
     */
    public static String getJdbcUrl() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    /**
     * 获取 jdbc username
     *
     * @return
     */
    public static String getJdbcUsername() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取 jdbc password
     *
     * @return
     */
    public static String getJdbcPassword() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取 应用基础包名
     *
     * @return
     */
    public static String getAppBasePackage() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取 应用jsp路径
     *
     * @return
     */
    public static String getAppJspPath() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH);
    }

    /**
     * 获取 静态资源路径
     *
     * @return
     */
    public static String getAppAssetPath() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.APP_ASSET_PATH);
    }
}
