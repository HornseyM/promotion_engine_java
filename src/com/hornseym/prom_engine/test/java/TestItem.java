package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.hornseym.prom_engine.main.java.Item;

public class TestItem {
    /**
     * This is the test class encapsulating the unit tests for the Item class.
     */

    @Test
    public void testItemInstantiable()
    {
        /**
         * Test that the Item class can be initialise without issues
         */
        Item item = new Item("A", 50);
        assertNotNull(item);
    }

    @Test
    public void testItemInitialisedWithName()
    {
        /**
         * Test that when the item is initialise with a name, it stores and returns the name.
         */
        Item item = new Item("A", 50);
        assertEquals("A", item.getName());
    }

    @Test
    public void testItemInitialisedWithPrice()
    {
        /**
         * Test that when the item is initialise with a price, it stores and returns the price.
         */
        Item item = new Item("A", 50);
        assertEquals(50, item.getPrice());
    }
    
}
