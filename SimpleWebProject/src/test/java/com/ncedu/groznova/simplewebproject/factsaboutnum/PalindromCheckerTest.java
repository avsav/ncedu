package com.ncedu.groznova.simplewebproject.factsaboutnum;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PalindromCheckerTest {
    private int testData;
    private boolean expected;
    private FactAboutNum palindromChecker = new PalindromChecker();

    public PalindromCheckerTest(int testData, boolean expected) {
        this.testData = testData;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1, true},
            {121, true},
            {132, false},
            {12521, true},
            {13156, false},
            {21612, true},
            {25117, false},
            {52567, false}
        });
    }

    @Test
    public void test() {
        assertEquals(palindromChecker.check(testData), expected);
    }
}
