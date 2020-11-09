import com.yifan.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test01
 *
 * @author luoyi
 * @date 2020-11-2020/11/6 21:10
 */
public class Test01 {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people", People.class);
        people.getCat().meow();
        people.getDog().bark();
    }
}
