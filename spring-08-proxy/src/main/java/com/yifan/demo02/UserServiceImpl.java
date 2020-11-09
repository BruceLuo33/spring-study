package com.yifan.demo02;

/**
 * UserServiceImpl
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 20:35
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更改了一个用户");
    }

    public void query() {
        System.out.println("查找了一个用户");
    }
}
