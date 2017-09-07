package cn.imory.zb.exception;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>名称</p>
 * <p/>
 * <p>wikiURL</p>
 *
 * @author zb.jiang
 * @version 1.0
 * @Date 2017/9/7
 */
//全局异常捕捉
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    private static Logger logger = Logger.getLogger(GlobalDefaultExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e)
    {
        e.printStackTrace();
        logger.error("GlobalDefaultExceptionHandler.defaultErrorHandler:" + e.getMessage());
    }
}
