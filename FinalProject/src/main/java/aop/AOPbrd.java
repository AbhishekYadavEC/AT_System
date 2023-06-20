package aop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

public class AOPbrd {
    private static final Logger logger = LogManager.getLogger("Abhishek");

    @Before("execution(* service.MakerCustomerServiceImpl.*(..))")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("Execution of ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method started.");
    }

    @Before("execution(* service.MakerCustomerServiceImpl.*(..))")
    public void afterMethodExecution(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("Execution of ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method ended.");
    }


    @AfterReturning(value = "execution(* service.MakerCustomerServiceImpl.*(..))", returning = "result")
    public void afterMethodExecution(JoinPoint joinPoint, Object result) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("After Execution of ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method, result = " + result);
    }


    @AfterThrowing("execution(* service.MakerCustomerServiceImpl.*(..))")
    public void afterMethodException(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("Exception occurred while executing ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method");
    }




    @Before("execution(* service.CheckerCustomerServiceImpl.*(..))")
    public void beforeMethodExecution1(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("Execution of ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method started.");
    }

    @Before("execution(* service.CheckerCustomerServiceImpl.*(..))")
    public void afterMethodExecution1(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("Execution of ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method ended.");
    }


    @AfterReturning(value = "execution(* service.CheckerCustomerServiceImpl.*(..))", returning = "result")
    public void afterMethodExecution1(JoinPoint joinPoint, Object result) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("After Execution of ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method, result = " + result);
    }


    @AfterThrowing("execution(* service.CheckerCustomerServiceImpl.*(..))")
    public void afterMethodException1(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        System.out.println("Exception occurred while executing ("+joinPoint.getSignature().toShortString().replace("..", Arrays.asList(objects).toString())+") method");
    }
}
