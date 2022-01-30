package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;

import com.hornseym.prom_engine.main.java.Basket;
import com.hornseym.prom_engine.main.java.Item;
import com.hornseym.prom_engine.main.java.ItemBuilder;
import com.hornseym.prom_engine.main.java.PromotionA;
import com.hornseym.prom_engine.main.java.PromotionB;

import org.junit.Ignore;

import org.junit.Test;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

/* 
 * Aceptence test from customer are as follows:

 * Unit price for SKU IDs A	50
 * B	30
 * C	20
 * D	15

 * Active Promotions
 * 3 of A's for 130
 * 2 of B's for 45 
 * C & D for 30

 * Scenario A
 * 1 * A -> 50
 * 1 * B -> 30
 * 1 * C -> 20

 * Total  = 100

 * Scenario B
 * 5 * A -> 130 + 2*50
 * 5 * B -> 45 + 45 + 30
 * 1 * C -> 20 (orriginal was 28, assumed typo)

 * Total  = 370

 * Scenario C
 * 3 * A -> 130
 * 5 * B -> 45 + 45 + 1 * 30
 * 1 * C -
 * 1 * D -> 30

 * Total  = 280
 */

public class TestAcceptence
{

    @Test
    public void testScenarioA()
    {
        /*
         * Scenario A is defined as follows:
    
         * Scenario A
         * (1 * A) + (1 * B) + (1 * C) = 100
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getB(), ItemBuilder.getC()};
        Basket basket = new Basket(items);
        assertEquals("Total in Scenario A should be 100", 100, basket.getTotal());

    }

    @Test
    public void testScenarioB()
    {
        /*
         * Scenario B is defined as follows:
    
         * Scenario B
         * (5 * A) + (5 * B) + (1 * C) = 370
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getA(), ItemBuilder.getA(), ItemBuilder.getA(), 
                        ItemBuilder.getA(),
                        ItemBuilder.getB(), ItemBuilder.getB(), ItemBuilder.getB(), ItemBuilder.getB(), 
                        ItemBuilder.getB(),
                        ItemBuilder.getC()};
        Basket basket = new Basket(items);
        PromotionA promA = new PromotionA();
        PromotionB promB = new PromotionB();
        basket = promB.apply(promB.apply(promA.apply(basket)));
        assertEquals("Total in Scenario B should be 370", 370, basket.getTotal());
    }

    @Ignore("Functionality not yet implented.")
    @Test
    public void testScenarioC()
    {
        /*
         * Scenario C is defined as follows:
    
         * Scenario C
         * (3 * A) + (5 * B) + (1 * C) + (1 * D) = 280
         */
        
    }

}
