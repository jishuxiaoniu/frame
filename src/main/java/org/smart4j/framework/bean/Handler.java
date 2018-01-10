package org.smart4j.framework.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * @Author duan
 * @Description:    封装 action 信息
 * @Date: Created in 下午1:33 2018/1/10
 */
@Data
@AllArgsConstructor
public class Handler {

    /**Controller Class*/
    private Class<?> controllerClass;

    /**Method 方法*/
    private Method actionMethod;
}
