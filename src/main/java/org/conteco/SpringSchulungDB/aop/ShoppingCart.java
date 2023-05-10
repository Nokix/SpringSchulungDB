package org.conteco.SpringSchulungDB.aop;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Component
public class ShoppingCart {
    HashMap<Item, Long> cart = new HashMap<>();

    Long price = 0L;
    Long count = 0L;

    @TimeMe
    public Item addItem(Item item) {
        Long itemCount = cart.getOrDefault(item, 0L);
        cart.put(item, itemCount + 1);
        return item;
    }

    public Item removeItem(Item item) {
        if (cart.containsKey(item)) {
            Long itemCount = cart.get(item);
            if (itemCount > 1) {
                cart.put(item, itemCount - 1);
            } else {
                cart.remove(item);
            }
        }
        return item;
    }

    public Long updatePrice() {
        price = cart.entrySet().stream()
                .mapToLong(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
        return price;
    }

    public Long updateCount() {
        count = cart.values().stream().mapToLong(Long::longValue).sum();
        return count;
    }

    public String checkout() {
        return "Your price is " + price + " with " + count + " Items.";
    }
}
