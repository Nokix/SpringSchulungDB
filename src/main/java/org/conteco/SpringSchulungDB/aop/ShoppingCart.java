package org.conteco.SpringSchulungDB.aop;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ShoppingCart {
    HashMap<Item, Long> cart = new HashMap<Item, Long>();

    Long price = 0L;
    Long count = 0L;

    public Item addItem(Item item) {
        return item;
    }

    public Item removeItem(Item item) {
        updateCount();
        updatePrice();
        return item;
    }

    public Long updatePrice() {
        return price;
    }

    public Long updateCount() {
        return count;
    }

    public String checkout() {
        return "Your price is " + price + " with " + count + " Items.";
    }
}
