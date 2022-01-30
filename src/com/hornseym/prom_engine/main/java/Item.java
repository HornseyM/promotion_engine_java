package com.hornseym.prom_engine.main.java;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class Item {
    /**
     * This class contains a item that can be in a basket.
     */

    private final String name;
    private final int price;

     public Item(String name, int price)
     {
         this.name = name;
         this.price = price;
     }

     // Getters

     /**
      * Returns the name of the item
      * @return Name of the item.
      */
     public String getName()
     {
         return name;
     }

     /**
      * Returns the price of the item
      * @return Price of the item.
      */
     public int getPrice()
     {
         return price;
     }
}
