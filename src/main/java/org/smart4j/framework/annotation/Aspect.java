package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * @Author duan
 * @Description: 切面注解
 * @Date: Created in 上午8:56 2018/1/11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Aspect {

    /**注解*/
    Class<? extends Annotation> value();
}
