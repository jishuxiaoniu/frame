package org.smart4j.framework.bean;

import lombok.AllArgsConstructor;
import org.smart4j.framework.utils.CastUtil;

import java.util.Map;

/**
 * @Author duan
 * @Description: 请求参数对象
 * @Date: Created in 下午1:53 2018/1/10
 */
@AllArgsConstructor
public class Param {

    private Map<String, Object> paramMap;

    /**
     * 根据参数名，获取 long 型参数
     */
    public long getLong(String key) {
        return CastUtil.castLong(paramMap.get(key));
    }

    public Map<String, Object> etMap() {
        return paramMap;
    }
}
