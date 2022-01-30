package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;

import com.hornseym.prom_engine.main.java.Basket;
import com.hornseym.prom_engine.main.java.PromotionB;

import org.junit.Test;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class TestPromotionB {
    /**
     * Class to encapsulate the Testing of promotion B: 2 of B's for 45
     */

    @Test
    public void testEmptyBasketIsUnchanged()
    {
        /**
         * An empty basket shoud be unchanged by applying Promotion B
         */
        Basket basket = new Basket();
        basket = PromotionB.apply(basket);
        assertEquals("An empty basket should be unchanged by promotion B", 0, basket.getTotal());
    }
}
