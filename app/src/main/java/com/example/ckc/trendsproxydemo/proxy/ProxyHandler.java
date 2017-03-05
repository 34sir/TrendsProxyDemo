package com.example.ckc.trendsproxydemo.proxy;

import android.content.Context;
import android.widget.Toast;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

/**
 * Created by ckc on 2017/3/5.
 *
 * 动态代理的优点可以总结出某些类的共同特征 统一做同一操作  不需要生成多个静态代理
 */

public class ProxyHandler implements InvocationHandler{
    private Object target;
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result;

        result=method.invoke(target,objects);

        return result;
    }
}
