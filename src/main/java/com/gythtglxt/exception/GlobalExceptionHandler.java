package com.gythtglxt.exception;

import com.gythtglxt.error.BusinessException;
import com.gythtglxt.error.EmBusinessError;
import com.gythtglxt.response.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Author:wangzh
 * Date: 2020/11/1 14:54
 * Version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResponseData bizExceptionHandler(BusinessException e){
        logger.error("发生业务异常！原因是：{}",e.getErrMsg());
        return new ResponseData(e);
    }


    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResponseData exceptionHandler(Exception e){
        logger.error("未知异常！原因是:",e);
        return new ResponseData();
    }

//    /**
//     * 处理权限不足异常
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(value = AccessDeniedException.class)
//    @ResponseBody
//    public ResponseData accessDeniedExceptionHandler(AccessDeniedException e){
//        logger.error("发生权限异常！原因是：{}",e);
//        return new ResponseData(EmBusinessError.NO_PERMISSION);
//    }

}
