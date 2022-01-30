package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;

import com.hornseym.prom_engine.main.java.Basket;
import com.hornseym.prom_engine.main.java.Item;
import com.hornseym.prom_engine.main.java.ItemBuilder;
import com.hornseym.prom_engine.main.java.PromotionA;

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

    @Test
    public void testBasketWithOneAIsUnchanged()
    {
        /**
         * A basket only one A shoud be unchanged by applying Promotion A
         */
        Item[] items = {ItemBuilder.getA()};
        Basket basket = new Basket(items);
        basket = PromotionA.apply(basket);
        assertEquals("A basket with just one A should be unchanged by promotion A", 50, basket.getTotal());
    }

    @Test
    public void testBasketWithTwoAIsUnchanged()
    {
        /**
         * A basket only two As shoud be unchanged by applying Promotion A
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getA()};
        Basket basket = new Basket(items);
        basket = PromotionA.apply(basket);
        assertEquals("A basket with just two A should be unchanged by promotion A", 100, basket.getTotal());
    }

    @Test
    public void testBasketWithTwoAAndOthersIsUnchanged()
    {
        /**
         * A basket only two As and other items shoud be unchanged by applying Promotion A
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getA(), ItemBuilder.getB()};
        Basket basket = new Basket(items);
        basket = PromotionA.apply(basket);
        assertEquals("A basket with just two A and others should be unchanged by promotion A", 130, basket.getTotal());
    }

    @Test
    public void testBasketWithTreeAIsChanged()
    {
        /**
         * A basket three As shoud be changed by applying Promotion A
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getA(), ItemBuilder.getA()};
        Basket basket = new Basket(items);
        basket = PromotionA.apply(basket);
        assertEquals("A basket with just three A should be undated by promotion A", 130, basket.getTotal());
    }
    
}
