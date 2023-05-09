package org.conteco.SpringSchulungDB.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Aspect
@Component
public class UpdateAspect {

    @Before("within(ShoppingCart)")
    public void update(JoinPoint joinPoint) {
        ShoppingCart cart = (ShoppingCart) joinPoint.getTarget();
        cart.updatePrice();
        cart.updateCount();
    }

    @Around("within(ShoppingCart) && args(item)")
    public Object checkIfForbidden(
            ProceedingJoinPoint joinPoint,
            Item item) throws Throwable {

        if (Objects.isNull(item)) {
            item = new Item("Banane", 50L);
        }

        Object result = joinPoint.proceed(new Item[]{item});

        return result;
    }
}
