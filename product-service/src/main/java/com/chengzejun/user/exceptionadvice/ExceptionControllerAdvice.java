package com.chengzejun.user.exceptionadvice;


import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    //捕捉@RequestMapping对应方法的数据验证结果
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        ObjectError error=e.getBindingResult().getAllErrors().get(0);
        return new ResultVo<String>(1001,"响应失败",error.getDefaultMessage());
    }

    @ExceptionHandler(ApiExection.class)
    public ResultVo<String> apiException(ApiExection e){
        return new ResultVo<String>(ResultCode.FAILED,e.getMsg());
    }
}
