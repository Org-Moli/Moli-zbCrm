package cn.imory.zb.common.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/8
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static Logger logger = Logger.getLogger(SpringUtil.class);

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        if (SpringUtil.applicationContext == null)
        {
            SpringUtil.applicationContext = applicationContext;
        }
        logger.info("=======================*************************=======================");
        logger.info("=======================加载applicationContext成功:" + applicationContext);
        logger.info("=======================*************************=======================");
    }

    /**
     * 获取applicationContext
     *
     * @return
     */
    public static ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }

    /**
     * 根据name获取bean
     *
     * @param name
     * @return
     */
    public static Object getBean(String name)
    {
        return getApplicationContext().getBean(name);
    }

    /**
     * 根据class获取bean
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> clazz)
    {
        return getApplicationContext().getBean(clazz);
    }

    /**
     * 根据name和class获取bean
     *
     * @param name
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getBean(String name, Class<T> clazz)
    {
        return getApplicationContext().getBean(name, clazz);
    }
}
