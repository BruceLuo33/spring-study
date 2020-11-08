package com.yifan.demo03;

/**
 * Client
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 21:29
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色：现在没有
        // 因为只有处理程序，这并不是一个代理类，而是要通过他去生成一个代理类
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        // 通过调用程序处理角色，来处理我们要调用的接口对象！
        // 真实角色和代理角色都会来实现同一个接口
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy(); // 这里的 proxy 就是动态生成的，我们并没有写
        proxy.rent();
    }
}
