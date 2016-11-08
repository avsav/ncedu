package com.ncedu.groznova.simplewebtask;

import com.ncedu.groznova.simplewebtask.factsaboutnum.FactAboutNum;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ClassifierTest {

    private Classifier classifier = new Classifier();

    /* Method checks that property() and checkIs(n) would be called */
    @Test
    public void methCallingTest() {
        int n = new Random().nextInt();
        FactAboutNum fan = mock(FactAboutNum.class);
        classifier.setFactsAboutNum(Arrays.asList(fan));
        classifier.mapp(n);
        verify(fan).property();
        verify(fan).checkIs(n);
    }
}
