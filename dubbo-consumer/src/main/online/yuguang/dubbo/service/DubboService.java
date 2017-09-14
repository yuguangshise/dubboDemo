package yuguang.dubbo.service;

import org.springframework.stereotype.Service;

/**测试Service类,用来测试spring的Autowired自动注入是否正常
 * Created by 何毅 on 2017/9/13.
 */
@Service("dubboService")
public class DubboService {
    public String test()
    {
        return "this is a test of dubboService";
    }
}