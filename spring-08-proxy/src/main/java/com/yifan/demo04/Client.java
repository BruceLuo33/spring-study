package com.yifan.demo04;

import com.yifan.demo02.UserService;
import com.yifan.demo02.UserServiceImpl;

/**
 * Client
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 21:41
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色，不存在
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        handler.setTarget(userService); // 设置要代理的对象

        // 动态生成代理类
        UserService proxy = (UserService) handler.getProxy();

        proxy.add();
    }
}
