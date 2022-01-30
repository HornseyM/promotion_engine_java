package com.hornseym.prom_engine.main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PromotionA {
    /**
     * Promotion A is: 3 of A's for 130
     */

    private PromotionA() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }

    /**
     * Apply's Promotion A to the basket: 3 of A's for 130. N.B. this method creates a new 
     * basket, it does not modify the one passed in.
     * @param basket The basket to apply Promotion A to
     * @return A new basket with Promotion A applied
     */
    public static Basket apply(Basket basket)
    {
        // By default, return the basket unchanged
        Basket ret = basket;
        List<Item> items = basket.getItems();

        // Get the As...
        List<Item> threeAs = items.stream().filter((item) -> item.getName() == "A").limit(3).collect(Collectors.toList());

        // ...And if there were 3, apply the promotion
        if(threeAs.size() == 3)
        {
            // Get the items without the As the promotion is being applied to
            items = items.stream().filter((item) -> !threeAs.contains(item)).collect(Collectors.toList());
            // Create the promotion item and add it to the remaining items, then create a new basket.
            Item promo = new Item("Three As", 130);
            items.add(promo);
            ret = new Basket(items);
        }

        // Return the old or new basket
        return ret;
    }
    
}
