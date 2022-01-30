package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.hornseym.prom_engine.main.java.Basket;
import com.hornseym.prom_engine.main.java.Item;
import com.hornseym.prom_engine.main.java.ItemBuilder;

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
    public void testBasketInitialisableWithNoBasket()
    {
        /**
         * Test that the Basket class can be initialise without issues
         */
        Basket basket = new Basket();
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithEmptyBasketArray()
    {
        /**
         * Test that the Basket class can be initialise with nothing in it
         */
        Item[] items = {};
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithEmptyBasketArrayList()
    {
        /**
         * Test that the Basket class can be initialise with nothing in it
         */
        Basket basket = new Basket(new ArrayList<Item>());
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithOneItemArray()
    {
        /**
         * Test that the Basket class can be initialise with one item in it as an array
         */
        Item[] items = {ItemBuilder.getA()};
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithOneItemArrayList()
    {
        /**
         * Test that the Basket class can be initialise with one item in it as an Array List
         */
        Item[] itemsA = {ItemBuilder.getA()};
        ArrayList<Item> items = new ArrayList<Item>(Arrays.asList(itemsA));
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithSeveralItemsArray()
    {
        /**
         * Test that the Basket class can be initialise withmultiple items in it as an array
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getB(), ItemBuilder.getC()};
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithSeveralItemsArrayList()
    {
        /**
         * Test that the Basket class can be initialise withmultiple items in it as an Array List
         */
        Item[] itemsA = {ItemBuilder.getA(), ItemBuilder.getB(), ItemBuilder.getC()};
        ArrayList<Item> items = new ArrayList<Item>(Arrays.asList(itemsA));
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testTotalIsZeroWhenBasketEmpty()
    {
        /**
         * If the basket is empty, the total should be 0.
         */
        Basket basket = new Basket();
        assertEquals("Empty basket should have 0 total", 0, basket.getTotal());
    }

    @Test
    public void testTotalIsCorrectWithOneItem()
    {
        /**
         * If the basket has one item the total should be the price of the item.
         */
        Item[] items = {ItemBuilder.getA()};
        Basket basket = new Basket(items);
        assertEquals("Empty basket should have total for one item", 50, basket.getTotal());
    }

    @Test
    public void testTotalIsCorrectWithmultipleItems()
    {
        /**
         * If the basket has multiple items the total should be the price of all the items.
         */
        Item[] items = {ItemBuilder.getA(), ItemBuilder.getB(), ItemBuilder.getC()};
        Basket basket = new Basket(items);
        assertEquals("Empty basket should have total for multiple items", 100, basket.getTotal());
    }
    
}
