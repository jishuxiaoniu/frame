package org.smart4j.framework;

import org.smart4j.framework.helper.*;
import org.smart4j.framework.utils.ClassUtil;

/**
 * @Author duan
 * @Description: 加载相应的 helper 类
 * @Date: Created in 下午1:48 2018/1/10
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };

        for (Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName());
        }
    }
}
