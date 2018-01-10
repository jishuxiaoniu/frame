package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * @Author duan
 * @Description: 方法注解
 * @Date: Created in 上午10:44 2018/1/10
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Action {
    /**
     * 请求类型与路径
     * @return
     */
    String value();
}
