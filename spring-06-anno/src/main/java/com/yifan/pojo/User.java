package com.yifan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * User
 *
 * @author luoyi
 * @date 2020-11-2020/11/6 23:17
 */

// 等价于    <bean id="user" class="com.yifan.pojo.User"/>
@Component
@Scope("singleton")
public class User {

    // 相当于<property name="name" value="yifan"/>
    @Value("yifan")
    public String name;

    @Value("yifan2")
    public void setName(String name) {
        this.name = name;
    }
}
