package com.ncedu.groznova.simplewebtask.factsaboutnum;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IsLeonardoSeqTest {
    private int testData;
    private boolean expected;
    private FactAboutNum isLeonardoSeq = new IsLeonardoSeq();

    public IsLeonardoSeqTest(int testData, boolean expected) {
        this.testData = testData;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1, true},
            {3, true},
            {11, false},
            {67, true},
            {131, false},
            {1219, true},
            {1300, false},
            {900, false}
        });
    }

    @Test
    public void test() {
        assertEquals(isLeonardoSeq.checkIs(testData), expected);
    }

}

