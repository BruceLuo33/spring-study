package com.yifan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User
 *
 * @author luoyi
 * @date 2020-11-2020/11/7 21:49
 */

// 这个注解的意思是，这个类被 Spring 接管了，注册到了容器之中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("yifan")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
