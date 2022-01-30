package com.hornseym.prom_engine.main.java;

import javax.naming.OperationNotSupportedException;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public class PromotionB {
    /**
     * Promotion A is: 2 of B's for 45
     */

    private PromotionB() throws OperationNotSupportedException
    {
        // Class should be not initialisable
        throw new OperationNotSupportedException();

    }

    /**
     * Apply's Promotion B to the basket: 2 of B's for 45. N.B. this method creates a new 
     * basket, it does not modify the one passed in.
     * @param basket
     * @return
     */
    public static Basket apply(Basket basket)
    {
        // By default return the orriginal basket
        Basket ret = basket;

        // Return old or new basket
        return ret;

    }
    
}
