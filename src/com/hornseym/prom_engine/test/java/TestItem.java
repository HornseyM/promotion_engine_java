package com.hornseym.prom_engine.test.java;

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
        Item item = new Item();
        assertNotNull(item);
        
    }
    
}
