package com.yifan.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Log
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 22:38
 */
public class Log implements MethodBeforeAdvice {

    // Method: 要执行的目标对象的方法
    // Object[]：参数，可以改为 args
    // Object o：目标对象，改为 target
    // 会在执行方法前自动去调用
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
