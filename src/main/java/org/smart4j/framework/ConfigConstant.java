package org.smart4j.framework;

/**
 * @Author duan
 * @Description: 读取配置文件类
 * @Date: Created in 下午6:39 2018/1/9
 */
public interface ConfigConstant {

    String CONFIG_FILE = "smart.properties";

    String JDBC_DRVIER = "smart.framework.jdbc.driver";
    String JDBC_URL = "smart.framework.jdbc.url";
    String JDBC_USERNAME = "smart.framework.jdbc.username";
    String JDBC_PASSWORD = "smart.framework.jdbc.password";

    String APP_BASE_PACKAGE = "smart.framework.jdbc.base_package";
    String APP_JSP_PATH = "smart.framework.jdbc.jsp_path";
    String APP_ASSET_PATH = "smart.framework.jdbc.asset_path";
}
