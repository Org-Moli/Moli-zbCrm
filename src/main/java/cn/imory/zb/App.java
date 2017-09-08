package cn.imory.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/7
 */
@SpringBootApplication
@EntityScan(basePackages = "cn.imory.zb")
@ServletComponentScan
public class App {

    public static void main(String args[])
    {
        SpringApplication.run(App.class, args);
    }
}
