import com.yifan.service.UserService;
import com.yifan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test01
 *
 * @author luoyi
 * @date 2020-11-2020/11/8 22:58
 */
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // 动态代理代理的是 接口！ 但是一开始用的是 Impl 实现类
        // 相当于返回的是被创建的代理类，代理类与被代理类都实现的是UserService接口
        // 所以新生成的代理类只能向上转型为接口类型，不能同等级强转给UserServiceImpl
        UserService service = context.getBean("userService", UserService.class);
        service.select();
    }
}
