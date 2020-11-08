package com.yifan.demo01;

/**
 * Proxy
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 19:38
 */
// 组合优于继承，少用 extends
public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        contract();
        fee();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 收中介费
    public void fee() {
        System.out.println("收中介费");
    }

    // 签合同
    public void contract() {
        System.out.println("签租赁合同");
    }
}
