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
    
}
