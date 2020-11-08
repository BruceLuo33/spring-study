package com.yifan.demo04;

import com.yifan.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyInvocationHandler
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 21:05
 */
// 等下会用这个类，自动生成代理类
// 注意和 demo01 的proxy进行对比
public class ProxyInvocationHandler implements InvocationHandler {

    // 三个组成部分：
    // 1. 调用谁？ Object target
    // 2. 生成代理类
    // 3. 调用代理程序的执行方法

    // 被代理的
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
// 官方代码：
//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//            new Class<?>[] { Foo.class },
//            handler);

    // 生成得到代理类，如何得到？ 使用自带的 newInstance 方法就可以了
    // newProxyInstance 的三个参数：
    // 第一个是类加载器 ClassLoader，
    // 第二个参数是需要代理的接口，在这里我们想要实现代理功能的接口是 Rent，所以就在前面 新建一个 rent 参数，通过反射获得接口
    // 第三个参数是 invocationHandler，传入自身就行了
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质，就是使用反射机制实现！
        // invoke 就是传参调用方法，代理还是代理，只是被代理的对象放到了实现的时候来确定
        // invoke 来执行方法，即 args
        // invoke 的底层代码是反射机制，通过反射机制来得到 Rent 类中的 rent() 方法，并返回给result，同时返回result
        // log("add"); // 如果这么写的话，其实非常不灵活，如果使用反射就可以比较好的达到灵活的要求
        // 为什么下面这个可以执行呢？因为 method 是方法的对象，它包含了这个方法的所有信息，自然也包括方法的名字
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }

}
