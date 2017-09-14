package online.yuguang.dubbo.provider;

import online.yuguang.dubbo.service.UserService;

/**
 * Created by 何毅 on 2017/9/12.
 */
public class UserServiceImpl implements UserService {

    public String sayHi(String name) {
        return "hello " + name + "!";
    }
}