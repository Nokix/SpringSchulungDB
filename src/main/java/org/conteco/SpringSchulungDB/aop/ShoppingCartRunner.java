package org.conteco.SpringSchulungDB.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("aop")
public class ShoppingCartRunner implements CommandLineRunner {
    @Autowired
    ShoppingCart shoppingCart;

    @Override
    public void run(String... args) throws Exception {
        Item cola = new Item("Cola", 100L);
        Item banane = new Item("Banane", 50L);
        shoppingCart.addItem(banane);
//        shoppingCart.addItem(null);
//        shoppingCart.addItem(banane);
//        shoppingCart.addItem(cola);
//        shoppingCart.removeItem(banane);
        System.out.println(shoppingCart.checkout());
    }
}
