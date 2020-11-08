package com.yifan.demo02;

/**
 * UserServiceProxy
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 20:37
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    // 日志方法：原本要在 ServiceImpl 里面每一个具体的方法去加上，现在可以增加一层，实现一个公共的方法
    // 这样就没有在 ServiceImpl 中去一个一个的实现，也没有改变原有的代码
    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
