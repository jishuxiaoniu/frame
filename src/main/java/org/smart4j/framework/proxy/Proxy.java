package org.smart4j.framework.proxy;

/**
 * @Author duan
 * @Description: 代理接口
 * @Date: Created in 上午8:59 2018/1/11
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
