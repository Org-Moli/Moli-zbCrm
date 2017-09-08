package cn.imory.zb.common.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * <p>druid数据源状态监控.</p>
 * <p/>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/8
 */
@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name = "allow", value = "127.0.0.1"),//白名单(没有配置或者为空，则允许所有访问)
        @WebInitParam(name = "deny", value = "192.168.0.1"),//黑名单(存在共同时，deny优先于allow)
        @WebInitParam(name = "loginUsername", value = "admin"),//登录名
        @WebInitParam(name = "loginPassword", value = "admin"),//密码
        @WebInitParam(name = "resetEnable", value = "false")// 禁用HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet {

    private static final long serialVersionUID = 1L;
}
