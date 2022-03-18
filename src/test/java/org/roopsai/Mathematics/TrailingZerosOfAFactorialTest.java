package org.roopsai.Mathematics;

import org.junit.Assert;
import org.junit.Test;

public class TrailingZerosOfAFactorialTest {

    @Test
    public void testcountTrailingZeros() {
        Assert.assertEquals(4755475, TrailingZerosOfAFactorial.countTrailingZeros(19021920)) ;
    }
}
