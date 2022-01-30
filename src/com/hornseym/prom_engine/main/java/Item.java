package com.hornseym.prom_engine.main.java;

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
