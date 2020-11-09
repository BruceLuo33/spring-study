package com.yifan.diy;

/**
 * DiyPointCut
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 23:14
 */
public class DiyPointCut {
    public void before() {
        System.out.println("===========方法执行前===========");
    }

    public void after() {
        System.out.println("===========方法执行后===========");
    }
}
