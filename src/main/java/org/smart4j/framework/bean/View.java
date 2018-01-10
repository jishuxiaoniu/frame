package org.smart4j.framework.bean;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author duan
 * @Description: 返回视图对象
 * @Date: Created in 下午1:56 2018/1/10
 */
@Getter
public class View {

    /**
     * 视图路径
     */
    private String path;

    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

}
