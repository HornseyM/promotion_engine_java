package com.hornseym.prom_engine.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class Basket {

    private final List<Item> items;

    /**
     * Initialise an empty basket
     */
    public Basket()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Initialise a basket with the items
     * @param items Items to put int eh basket
     */
    public Basket(Item[] items)
    {
        this.items = new ArrayList<Item>(Arrays.asList(items));
    }

    /**
     * Initialise a basket with the items
     * @param items Items to put int eh basket
     */
    public Basket(List<Item> items)
    {
        this.items = new ArrayList<Item>(items);
    }

    // Getter/s

    /**
     * Gets the items in the basket
     * @return The items in the basket
     */
    public List<Item> getItems()
    {
        return items;
    }

    /**
     * Returns the total value of all the items in the basket.
     * @return The total of the basket
     */
    public int getTotal()
    {
        return items.stream().mapToInt(item -> item.getPrice()).sum();
    }
    
}
