package com.hornseym.prom_engine.main.java;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class PromotionB extends Promotion{
    /**
     * Promotion A is: 2 of B's for 45
     */

    public PromotionB()
    {
        // Do nothing

    }

    /**
     * Apply's Promotion B to the basket: 2 of B's for 45. N.B. this method creates a new 
     * basket, it does not modify the one passed in.
     * @param basket
     * @return The basket with the promotion applied once (if appropriate)
     */
    public Basket apply(Basket basket)
    {
        return this.applyNItems(basket, "B", 2, new Item("2 Bs for 45", 45));
    }
    
}
