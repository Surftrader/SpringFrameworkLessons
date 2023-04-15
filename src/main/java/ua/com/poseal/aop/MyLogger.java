package ua.com.poseal.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyLogger {

//    @Before(value = "execution(public void getMessage())")
    @Before(value = "execution(* * .getMessage(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("This is myLogger.log()");
        System.out.println(joinPoint.getSignature());
    }

    @AfterReturning(value = "execution(public String getName())", returning = "retVal")
    public void logAfter(Object retVal) {
        System.out.println("-----------------");
        System.out.println(retVal);
        System.out.println("-----------------");
    }
}
