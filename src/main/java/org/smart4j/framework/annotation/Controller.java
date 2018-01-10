package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * @Author duan
 * @Description: 控制器注解
 * @Date: Created in 上午10:41 2018/1/10
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Controller {
}
