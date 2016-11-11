package com.ncedu.groznova.simplewebproject;

import com.ncedu.groznova.simplewebproject.factsaboutnum.FactAboutNum;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ClassifierTest {

    private Classifier classifier = new Classifier();

    /* Method checks that property() and check(n) would be called */
    @Test
    public void methCallingTest() {
        int n = new Random().nextInt();
        FactAboutNum fan = mock(FactAboutNum.class);
        classifier.setFactsAboutNum(Arrays.asList(fan));
        classifier.mapp(n);
        verify(fan).property();
        verify(fan).check(n);
    }
}
