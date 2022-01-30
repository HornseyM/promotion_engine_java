package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;

import com.hornseym.prom_engine.main.java.Basket;

import org.junit.Test;

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
