package com.pk.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    protected final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.pk.controller.*.*(..))")
    public void pointCut(){
    }

    @Before("pointCut()")
    public void saveOpertion(JoinPoint joinPoint){
        logger.info("日志保存之前");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        MyLog myLog = method.getAnnotation(MyLog.class);
        if (myLog != null){
            String operation = myLog.operation();
            int type = myLog.type();
            System.out.println(operation + type);
        }

    }
}






