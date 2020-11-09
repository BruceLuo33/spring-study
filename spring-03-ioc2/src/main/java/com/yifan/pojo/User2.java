package com.yifan.pojo;

public class User2 {
    private String name;

    public User2() {
        System.out.println("User2 无参构造完成");
    }

    public User2(String name) {
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
