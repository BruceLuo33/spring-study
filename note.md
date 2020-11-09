## 常用依赖
```xml
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.1.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>

```

## 注解说明
- @Autowired：自动装配，先匹配类型，再匹配名字
  - 如果Autowired不能唯一匹配，就需要 @Qualifier 来唯一指定
- @Nullable：字段标记了这个注解，说明可以为空
- @Resource：自动装配，先匹配名字，再匹配类型
- @Component: 组件，放在类上，说明这个类被 Spring 管理了，他就是实现 <bean> 的功能
  - 等价于：```<bean id="user" class="com.yifan.pojo.User"/>```
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 