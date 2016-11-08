package com.ncedu.groznova.simplewebtask.factsaboutnum;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IsPrimeTest {
    private int testData;
    private boolean expected;
    private FactAboutNum isPrime = new IsPrime();

    public IsPrimeTest(int testData, boolean expected) {
        this.testData = testData;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {2, true},
            {7, true},
            {12, false},
            {113, true},
            {132, false},
            {199, true},
            {254, false},
            {525, false}
        });
    }

    @Test
    public void test() {
        assertEquals(isPrime.checkIs(testData), expected);
    }

}
