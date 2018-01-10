package org.smart4j.framework.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author duan
 * @Description: 反射工具类
 * @Date: Created in 上午10:56 2018/1/10
 */
@Slf4j
public class ReflectionUtil {

    /**
     * 创建实例
     *
     * @param cls
     * @return
     */
    public static Object newInstance(Class<?> cls) {
        Object instance;
        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            log.error("class new instance failure", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * 调用方法
     *
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invokeMethod(Object obj, Method method, Object... args) {

        Object result;
        try {
            method.setAccessible(true);
            result = method.invoke(obj, (Object[]) args);
        } catch (Exception e) {
            log.error("method invoke failure", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * 设置成员变量的值
     *
     * @param obj
     * @param field
     * @param value
     */
    public static void setField(Object obj, Field field, Object value) {

        try {
            field.setAccessible(true);

            field.set(obj, value);
        } catch (IllegalAccessException e) {
            log.error("set field value failure", e);
            throw new RuntimeException(e);
        }
    }
}
