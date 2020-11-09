package com.yifan.demo03;

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

    // 被代理的
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
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
                rent.getClass().getInterfaces(),
                this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质，就是使用反射机制实现！
        // invoke 就是传参调用方法，代理还是代理，只是被代理的对象放到了实现的时候来确定
        // invoke 来执行方法，即 args
        // invoke 的底层代码是反射机制，通过反射机制来得到 Rent 类中的 rent() 方法，并返回给result，同时返回result
        seeHouse();
        Object result = method.invoke(rent, args);
        fee();
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fee() {
        System.out.println("收中介费");
    }
}
