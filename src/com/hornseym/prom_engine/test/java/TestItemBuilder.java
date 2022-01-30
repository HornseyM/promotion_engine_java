package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import com.hornseym.prom_engine.main.java.Item;
import com.hornseym.prom_engine.main.java.ItemBuilder;

import org.junit.Test;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class TestItemBuilder {
    /**
     * This class contains the unit test for checking the ItemBilder class returns the right items 
     * when it has built them.
     */

     @Test
     public void testItemBuilderReturnsAWithCorrectName()
     {
         /**
          * This method tests that the item builder can build an A with the correct name
          */
          Item item = ItemBuilder.getA();
          assertEquals("Item A should be built with the name 'A'.", "A", item.getName());
     }

     @Test
     public void testItemBuilderReturnsAWithCorrectPrice()
     {
         /**
          * This method tests that the item builder can build an A with the correct Price
          */
          Item item = ItemBuilder.getA();
          assertEquals("Item A should be built with the price 50.", 50, item.getPrice());
     }

     @Test
     public void testItemBuilderReturnsBWithCorrectName()
     {
         /**
          * This method tests that the item builder can build an B with the correct name
          */
          Item item = ItemBuilder.getB();
          assertEquals("Item B should be built with the name 'B'.", "B", item.getName());
     }

     @Test
     public void testItemBuilderReturnsBWithCorrectPrice()
     {
         /**
          * This method tests that the item builder can build an B with the correct Price
          */
          Item item = ItemBuilder.getB();
          assertEquals("Item B should be built with the price 30.", 30, item.getPrice());
     }

     @Test
     public void testItemBuilderReturnsCWithCorrectName()
     {
         /**
          * This method tests that the item builder can build an C with the correct name
          */
          Item item = ItemBuilder.getC();
          assertEquals("Item C should be built with the name 'C'.", "C", item.getName());
     }

     @Test
     public void testItemBuilderReturnsCWithCorrectPrice()
     {
         /**
          * This method tests that the item builder can build an C with the correct Price
          */
          Item item = ItemBuilder.getC();
          assertEquals("Item C should be built with the price 20.", 20, item.getPrice());
     }

     @Test
     public void testItemBuilderReturnsDWithCorrectName()
     {
         /**
          * This method tests that the item builder can build an D with the correct name
          */
          Item item = ItemBuilder.getD();
          assertEquals("Item D should be built with the name 'D'.", "D", item.getName());
     }

     @Test
     public void testItemBuilderReturnsDWithCorrectPrice()
     {
         /**
          * This method tests that the item builder can build an D with the correct Price
          */
          Item item = ItemBuilder.getD();
          assertEquals("Item D should be built with the price 15.", 15, item.getPrice());
     }
    
}
