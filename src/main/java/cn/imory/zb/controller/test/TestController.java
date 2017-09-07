package cn.imory.zb.controller.test;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/7
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);

    //测试异常与日志文件
    @RequestMapping("/test")
    public int test()
    {
        return 100/0;
    }
}
