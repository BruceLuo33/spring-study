package com.yifan.service;

import com.yifan.dao.UserDao;
import com.yifan.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    // 利用 set 方法，进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
