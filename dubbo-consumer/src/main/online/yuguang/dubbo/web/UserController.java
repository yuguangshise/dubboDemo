package yuguang.dubbo.web;

import online.yuguang.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yuguang.dubbo.service.DubboService;

/**
 * Created by 何毅 on 2017/9/13.
 */
@Controller
@RequestMapping("/dubbo")
public class UserController {
    //测试注入远程调用服务的实例
    @Autowired
    private UserService userService;
    //测试注入调用本地服务实例
    @Autowired
    private DubboService dubboService;

    /*测试springMVC运转是否正常*/
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello,This is a test!";
    }

    /*调用远程服务*/
    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String testRemoteService(@PathVariable String name) {
        String welcome = userService.sayHi(name);
        return welcome;
    }

    /*调用本地服务*/
    @RequestMapping("/test1")
    @ResponseBody
    public String testLocalService() {
        return dubboService.test();
    }
}