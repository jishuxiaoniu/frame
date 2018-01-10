package org.smart4j.framework.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author duan
 * @Description:    封装请求信息
 * @Date: Created in 下午1:31 2018/1/10
 */
@Data
@AllArgsConstructor
public class Request {

    /**请求方法*/
    private String requestMethod;

    /**请求路径*/
    private String reqeustPath;
}
