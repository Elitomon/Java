package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private Factorial fact;

    @Before
    public void pretests() {
        fact = new Factorial();
    }

    @Test
    public void testSuite() {
        Assert.assertTrue(fact.compute(0) == 1);
        Assert.assertTrue(fact.compute(1) == 1);
        Assert.assertTrue(fact.compute(5) == 120);
        Assert.assertTrue(fact.compute(10) == 3628800);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNegativeArgs() {
        fact.compute(-1);
    }

}