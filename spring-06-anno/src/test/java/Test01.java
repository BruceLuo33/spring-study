import com.yifan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test01
 *
 * @author luoyi
 * @date 2020-11-2020/11/6 23:19
 */
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
