package org.smart4j.framework.helper;

import org.smart4j.framework.utils.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author duan
 * @Description: 助手类
 * @Date: Created in 上午11:04 2018/1/10
 */
public final class BeanHelper {

    /**
     * 定义bean的映射，用于存放bean类与bean实例的映射关系
     */
    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<>();

    static {
        for (Class<?> cls : ClassHelper.getBeanClassSet()) {
            BEAN_MAP.put(cls, ReflectionUtil.newInstance(cls));
        }
    }

    /**
     * 获取 bean 映射
     *
     * @return
     */
    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    /**
     * 获取 bean 实例
     *
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<?> cls) {
        if (!BEAN_MAP.containsKey(cls))
            throw new RuntimeException("can not get bean by class" + cls);
        return (T) BEAN_MAP.get(cls);
    }
}
