package com.chengzejun.user.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAop {

    @Pointcut("execution(* com.chengzejun.user.controller.UserController.*(..))")
    public void pointCut(){

    }


    @Before("pointCut()")
    public void logStart(){
        long time=System.currentTimeMillis();
        System.out.println("start time"+time);
    }

    @After("pointCut()")
    public long logEnd(){
        long time=System.currentTimeMillis();
        System.out.println("end time"+time);
        return time;
    }

    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("除法正常返回......运行结果是:{}");
    }

    @AfterThrowing("pointCut()")
    public void logException(){
        System.out.println("运行异常......异常信息是:{}");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("@Arount:执行目标方法之前...");
        Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
        System.out.println("@Arount:执行目标方法之后...");
        return obj;
    }
}
