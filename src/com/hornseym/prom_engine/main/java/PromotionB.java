package com.hornseym.prom_engine.main.java;

import java.util.List;
import java.util.stream.Collectors;

import javax.naming.OperationNotSupportedException;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class PromotionB {
    /**
     * Promotion A is: 2 of B's for 45
     */

    private PromotionB() throws OperationNotSupportedException
    {
        // Class should be not initialisable
        throw new OperationNotSupportedException();

    }

    /**
     * Apply's Promotion B to the basket: 2 of B's for 45. N.B. this method creates a new 
     * basket, it does not modify the one passed in.
     * @param basket
     * @return
     */
    public static Basket apply(Basket basket)
    {
        // By default return the orriginal basket
        Basket ret = basket;
        List<Item> items = basket.getItems();

        // Get the Bs...
        List<Item> twoBs = items.stream().filter((item) -> item.getName() == "B").limit(2).collect(Collectors.toList());

        // ...And if there were 2, apply the promotion
        if(twoBs.size() == 2)
        {
            // Get the items without the As the promotion is being applied to
            items = items.stream().filter((item) -> !twoBs.contains(item)).collect(Collectors.toList());
            // Create the promotion item and add it to the remaining items, then create a new basket.
            Item promo = new Item("Two Bs @ 45", 45);
            items.add(promo);
            ret = new Basket(items);
        }

        // Return old or new basket
        return ret;

    }
    
}
