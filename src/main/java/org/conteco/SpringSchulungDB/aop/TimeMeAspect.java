package org.conteco.SpringSchulungDB.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMeAspect {

    @Pointcut("@annotation(TimeMe)")
    public void timeMeAnnotated() {
    }

    @Pointcut("within(ShoppingCart)")
    public void shoppingCartMethod() {
    }

    @Around("timeMeAnnotated()")
    public Object timer(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object result = joinPoint.proceed();
        System.out.println("Method invocation: " + joinPoint.getSignature());
        System.out.println(System.nanoTime() - start);
        System.out.println();
        return result;
    }

    @Before("timeMeAnnotated()")
    public void someMessage(JoinPoint joinPoint) {
        System.out.println("Let's time some stuff!");
    }
}
