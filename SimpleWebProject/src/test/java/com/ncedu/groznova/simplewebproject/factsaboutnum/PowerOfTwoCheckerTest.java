package com.ncedu.groznova.simplewebproject.factsaboutnum;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PowerOfTwoCheckerTest {
    private int testData;
    private boolean expected;
    private FactAboutNum powerOfTwoChecker = new PowerOfTwoChecker();

    public PowerOfTwoCheckerTest(int testData, boolean expected) {
        this.testData = testData;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1, true},
            {8, true},
            {11, false},
            {64, true},
            {131, false},
            {256, true},
            {300, false},
            {525, false}
        });
    }

    @Test
    public void test() {
        assertEquals(powerOfTwoChecker.check(testData), expected);
    }
}
