package com.hornseym.prom_engine.main.java;

public class PromotionA {
    /**
     * Promotion A is: 3 of A's for 130
     */

    private PromotionA() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }

    /**
     * Apply's Promotion A to the basket: 3 of A's for 130. N.B. this method creates a new 
     * basket, it does not modify the one passed in.
     * @param basket The basket to apply Promotion A to
     * @return A new basket with Promotion A applied
     */
    public static Basket apply(Basket basket)
    {
        return basket;
    }
    
}
