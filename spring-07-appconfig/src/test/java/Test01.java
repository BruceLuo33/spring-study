import com.yifan.config.UserConfig;
import com.yifan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Test01
 *
 * @author luoyi
 * @date 2020-11-2020/11/7 21:53
 */
public class Test01 {
    public static void main(String[] args) {
        // 如果完全使用了配置类的方法去做，我们就只能通过 AnnotationConfig 上下文来获取容器，通过配置类的 class 对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = (User) context.getBean("testUser");
        System.out.println(user.getName());
    }
}
