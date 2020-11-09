import com.yifan.pojo.User;
import com.yifan.pojo.User2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {

        // Spring 容器，就类似于婚介网站
        // 只要在 ClassPathXmlApplicationContext 里面new出来了，就都被创建了，就算在 beans 里面没有进行赋值，也被创建了；
        // 同时，创建出来的同一类型的对象其实是一致的，可以看到 user==user2 的返回值是 true，即一个类型其实只创建了一个对象；
        // 这就是 spring 的单例模式
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        User user = (User) context.getBean("test");
//        User user2 = (User) context.getBean("user");
        user.show();
//        System.out.println(user==user2);
    }
}
