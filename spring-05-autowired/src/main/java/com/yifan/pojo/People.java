package com.yifan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * People
 *
 * @author luoyi
 * @date 2020-11-2020/11/6 21:01
 */
public class People {

    @Autowired
    @Qualifier("cat22")
    private Cat cat;

//    @Autowired
    @Resource(name = "dog11")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }


    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
