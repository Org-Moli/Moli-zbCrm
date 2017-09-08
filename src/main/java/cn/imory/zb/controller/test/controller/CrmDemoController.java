package cn.imory.zb.controller.test.controller;

import cn.imory.zb.controller.test.bean.CrmDemo;
import cn.imory.zb.controller.test.service.CrmDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/8
 */
@RestController
@RequestMapping("/crmDemo")
public class CrmDemoController {

    @Resource
    private CrmDemoService crmDemoService;

    @RequestMapping("/save")
    public String save()
    {
        CrmDemo crmDemo = new CrmDemo();
        crmDemo.setName("111");
        crmDemoService.save(crmDemo);
        return "save......";
    }
}
