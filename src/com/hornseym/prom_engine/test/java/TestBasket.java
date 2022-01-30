package com.hornseym.prom_engine.test.java;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.hornseym.prom_engine.main.java.Basket;
import com.hornseym.prom_engine.main.java.Item;

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
        Item[] items = {new Item("A", 50)};
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithOneItemArrayList()
    {
        /**
         * Test that the Basket class can be initialise with one item in it as an Array List
         */
        Item[] itemsA = {new Item("A", 50)};
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
        Item[] items = {new Item("A", 50), new Item("A", 50), new Item("A", 50)};
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }

    @Test
    public void testBasketInitialisableWithSeveralItemsArrayList()
    {
        /**
         * Test that the Basket class can be initialise withmultiple items in it as an Array List
         */
        Item[] itemsA = {new Item("A", 50), new Item("A", 50), new Item("A", 50)};
        ArrayList<Item> items = new ArrayList<Item>(Arrays.asList(itemsA));
        Basket basket = new Basket(items);
        assertNotNull(basket);
    }
    
}
