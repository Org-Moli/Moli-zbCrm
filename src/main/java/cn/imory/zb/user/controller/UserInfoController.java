package cn.imory.zb.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/8
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    @RequestMapping("/login")
    public String login()
    {
        return "/user/login";
    }
}
