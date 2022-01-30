package com.hornseym.prom_engine.main.java;

import java.util.List;
import java.util.stream.Collectors;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public abstract class Promotion {
    /**
     * Parent class of promotions, providing interface and common methods.
     * 
     */

     /**
      * Takes in a basket and applies the promotion that replaces a number of items of the 
      same type with a lower price.
      * @param basket The basket to apply the promotion to
      * @param name The name of the items the promotion applies to
      * @param num The number of items the promotion applies to
      * @param replace The promotion item to replace them with
      * @return The basket with the promotion applied once (if appropriate) 
      */
    protected Basket applyNItems(Basket basket, String name, int num, Item replace)
    {
        // By default, return the basket unchanged
        Basket ret = basket;
        List<Item> items = basket.getItems();

        // Get the items by name...
        List<Item> promItems = items.stream().filter((item) -> item.getName() == name).limit(num).collect(Collectors.toList());

        // ...And if there were the specified number, apply the promotion
        if(promItems.size() == num)
        {
            // Get the items not in the promotion
            items = items.stream().filter((item) -> !promItems.contains(item)).collect(Collectors.toList());
            // Add the replacement promotion item to the remaining items, then create a new basket.
            items.add(replace);
            ret = new Basket(items);
        }

        // Return the old or new basket
        return ret;
    }

    /**
     * The apply method should apply a promotion to a basket. It shoudl not change the basket it 
     * is passed; instead it should return a new basket with the promotion applied (and the relevant 
     * items removed).
     * @param basket The basket to apply the promotion to
     * @return The basket with the promotion applied once (if appropriate)
     */
    public abstract Basket apply(Basket basket);
    
}
