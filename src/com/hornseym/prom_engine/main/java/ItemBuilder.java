package com.hornseym.prom_engine.main.java;

import javax.naming.OperationNotSupportedException;

/* 
 * Copyright (C) 2022  Matthew Hornsey

 * This is part of the Promotion Engine project, relased under the terms of the 
 * GNU General Public License as published bythe Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version. A copy of this
 * is available at the root of the project or at <https://www.gnu.org/licenses/>.
 */

public final class ItemBuilder {
    /**
     * This class is a non-intialisable builder class for making items correctly.
     */

    private ItemBuilder() throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }

    /**
     * Builds and return one A item
     * @return An A item
     */
    public static Item getA()
    {
        return new Item("A", 50);
    }

    /**
     * Builds and return one B item
     * @return An B item
     */
    public static Item getB()
    {
        return new Item("B", 30);
    }

    /**
     * Builds and return one C item
     * @return An C item
     */
    public static Item getC()
    {
        return new Item("C", 20);
    }

    /**
     * Builds and return one D item
     * @return An D item
     */
    public static Item getD()
    {
        return new Item("D", 15);
    }
    
}
