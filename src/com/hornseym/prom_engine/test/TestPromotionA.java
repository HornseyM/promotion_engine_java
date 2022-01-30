package com.hornseym.prom_engine.test;

import static org.junit.Assert.assertEquals;

import com.hornseym.prom_engine.main.java.Basket;

import org.junit.Test;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class TestPromotionA {
    /**
     * Class the contain the test for the Promotion A
     */

    @Test
    public void testEmptyBasketIsUnchanged()
    {
        /**
         * An empty basket shoud be unchanged by applying Promotion A
         */
        Basket basket = new Basket();
        basket = PromotionA.apply(basket);
        assertEquals("An empty basket should be unchanged by promotion A", 0, basket.getTotal());
    }
    
}
