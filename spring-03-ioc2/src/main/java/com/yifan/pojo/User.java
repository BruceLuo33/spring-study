package com.yifan.pojo;

public class User {
    private String name;

//    public User() {
//        System.out.println("User 无参构造完成");
//    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
