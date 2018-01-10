package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.utils.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

/**
 * @Author duan
 * @Description: 依赖注入助手类
 * @Date: Created in 上午11:11 2018/1/10
 */
public final class IocHelper {

    static {
        // 获取 bean 实例映射
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();

        if (beanMap != null && beanMap.size() > 0) {
            for (Map.Entry<Class<?>, Object> entry : beanMap.entrySet()) {
                Class<?> beanClass = entry.getKey();
                Object beanInstance = entry.getValue();

                // 获取 bean 类定义的所有成员变量
                Field[] fields = beanClass.getDeclaredFields();
                if (fields != null && fields.length > 0) {
                    for (Field field : fields) {
                        // 判断当前 bean 是否带有 Inject 注解
                        if (field.isAnnotationPresent(Inject.class)) {
                            Class<?> fieldClass = field.getType();
                            Object fieldInstance = beanMap.get(fieldClass);
                            ReflectionUtil.setField(beanInstance, field, fieldInstance);
                        }
                    }
                }

            }
        }
    }
}
