package com3.test.guigu;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(public int com3.test.guigu.*.*(int, int))")
    public void declareJointPointExpression(){}

    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("before");

        System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
    }

    @After("declareJointPointExpression()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after");
        System.out.println("The method " + methodName + " ends");
    }

    @AfterReturning(value="declareJointPointExpression()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after return ");
        System.out.println("The method " + methodName + " ends with " + result);
    }

    @AfterThrowing(value = "declareJointPointExpression()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after throw ");
        System.out.println("The method " + methodName + " occurs excetion: " + e);
    }
}
