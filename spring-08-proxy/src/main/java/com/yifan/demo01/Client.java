package com.yifan.demo01;

/**
 * Client
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 19:38
 */
public class Client {
    public static void main(String[] args) {
        // 房东要出租房子
        Host host = new Host();
        // 现在不找房东，而是去找中介
        // 代理，中介帮房东租房子，但是代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        // 你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
