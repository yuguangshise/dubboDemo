package yuguang.dubbo.test;

import online.yuguang.dubbo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**消费者测试类,当次类Main方法启动将从本项目spring容器中获取userService实例,而这个实例则是从远程项目提供过来的,用来测试调用远程服务是否成功
 * Created by 何毅 on 2017/9/13.
 */
public class Consumer {
    public static void main(String args[]) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService=(UserService)ctx.getBean("userService");
        System.out.println(userService.sayHi("will"));
        System.in.read();
    }
}
