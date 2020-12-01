package com.yifan.config;

import com.yifan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * UserConfig
 *
 * @author luoyi
 * @date 2020-11-2020/11/7 21:50
 */

// 这个注解也会被 Spring 容器托管，注册到容器中，因为它本来也是一个组件@COmponent
// // @Configuration 代表这是一个配置类，就和我们之前的 beans.xml 是一样的
@Configuration
@ComponentScan("com.yifan.pojo")
@Import(UserConfig2.class)
public class UserConfig {

    // 注册一个 bean，就相当于之前写的一个 bean 标签
    // 这个方法的名字就相当于 bean 标签中的 id 属性
    // 这个方法的返回值就相当于 bean 标签中的 class 属性
    // @Bean 相当于向 IoC 注入当前信息
    // this is a test
    @Bean
    public User testUser() {
        return new User(); // 就是返回要注入到 bean 的对象
    }
}
