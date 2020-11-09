package com.yifan.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * AfterLog
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 22:43
 */
// 这个方法和 Log 相比只是多了一个 returnValue 参数
public class AfterLog implements AfterReturningAdvice {

    // returnValue：返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为：" + returnValue);
    }
}
