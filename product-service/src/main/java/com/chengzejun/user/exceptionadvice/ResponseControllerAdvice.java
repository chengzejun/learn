package com.chengzejun.user.exceptionadvice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(basePackages = "com.chengzejun.user.controller")
public class ResponseControllerAdvice implements ResponseBodyAdvice {


    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return !methodParameter.getGenericParameterType().equals(ResultVo.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if(methodParameter.getGenericParameterType().equals(String.class)){
            ObjectMapper objectMapper=new ObjectMapper();

            try {
                return objectMapper.writeValueAsString(new ResultVo<>(o));
            } catch (JsonProcessingException e) {
               throw new ApiExection("返回String类型错误！");
            }
        }
        return new ResultVo<>(o);
    }
}
