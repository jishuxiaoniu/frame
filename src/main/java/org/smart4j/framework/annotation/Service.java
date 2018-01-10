package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * @Author duan
 * @Description: 服务类注解
 * @Date: Created in 上午10:43 2018/1/10
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Service {
}
