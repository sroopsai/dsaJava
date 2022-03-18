package org.roopsai.Mathematics;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest extends Assert {

    @Test
    public void testFactorialRecursive() {
        Assert.assertEquals(1, Factorial.factorial(1));
    }
}
