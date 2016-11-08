package com.ncedu.groznova.simplewebtask.factsaboutnum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IsCubeTest {
    private int testData;
    private boolean expected;
    private FactAboutNum isCube = new IsCube();

    public IsCubeTest(int testData, boolean expected) {
        this.testData = testData;
        this.expected = expected;

    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1, true},
            {8, true},
            {11, false},
            {125, true},
            {131, false},
            {216, true},
            {251, false},
            {525, false}
        });
    }

    @Test
    public void test() {
        assertEquals(isCube.checkIs(testData), expected);
    }

}
