package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class TestBasket {
    /**
     * This is the test class encapsulating the unit tests for the Basket class.
     */

    @Test
    public void testBasketInitialisable()
    {
        /**
         * Test that the Basket class can be initialise without issues
         */
        Basket basket = new Basket();
        assertNotNull(basket);
    }
    
}
