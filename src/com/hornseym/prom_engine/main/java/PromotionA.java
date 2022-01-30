package com.hornseym.prom_engine.main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class PromotionA extends Promotion {
    /**
     * Promotion A is: 3 of A's for 130
     */

    public PromotionA()
    {
        // Do nothing
    }

    /**
     * Apply's Promotion A to the basket: 3 of A's for 130. N.B. this method creates a new 
     * basket, it does not modify the one passed in.
     * @param basket The basket to apply Promotion A to
     * @return The basket with the promotion applied once (if appropriate)
     */
    public Basket apply(Basket basket)
    {
        return this.applyNItems(basket, "A", 3, new Item("3 As for 130", 130));
    }
    
}
