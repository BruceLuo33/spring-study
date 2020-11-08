package com.yifan.demo02;

/**
 * Client
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 20:36
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
