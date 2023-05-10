package org.conteco.SpringSchulungDB.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Aspect
@Component
public class TimeMeAspect {
    @Around("@annotation(TimeMe)")
    public Object update(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        int nano = ZonedDateTime.now().getNano();

        Object obj = proceedingJoinPoint.proceed();

        int nano2 = ZonedDateTime.now().getNano();
        System.out.println("es dauerte: " + (float) (nano2 - nano) / 1000000000 + "sekunden");

        return obj;
    }
}
