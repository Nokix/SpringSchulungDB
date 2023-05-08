package org.conteco.SpringSchulungDB.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UpdateAspect {

    @After("within(ShoppingCart)")
    public void update(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        ShoppingCart cart = (ShoppingCart) joinPoint.getTarget();
        cart.updatePrice();
        cart.updateCount();
    }
}
