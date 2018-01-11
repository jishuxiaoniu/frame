package org.smart4j.framework.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * @Author duan
 * @Description: 切面代理
 * @Date: Created in 上午9:32 2018/1/11
 */
@Slf4j
public abstract class AspectProxy implements Proxy {
    @Override
    public Object doProxy(ProxyChain proxyChain) throws Throwable {

        Object result = null;
        Class<?> cls = proxyChain.getTargetClass();
        Method method = proxyChain.getTargetMethod();
        Object[] params = proxyChain.getMethodParams();

        begin();
        try {
            if (interceptor(cls, method, params)) {
                before(cls, method, params);
                result = proxyChain.doProxyChain();
                after(cls, method, params, result);
            } else {
                result = proxyChain.doProxyChain();
            }
        } catch (Exception e) {
            log.error("proxy failure", e);
            error(cls, method, params, e);
            throw e;
        } finally {
            end();
        }

        return result;
    }


    public void begin() {

    }

    public boolean interceptor(Class<?> cls, Method method, Object[] params) throws Throwable {
        return true;
    }

    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
    }

    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
    }

    public void error(Class<?> cls, Method method, Object[] params, Exception e) {
    }

    public void end() {

    }
}
