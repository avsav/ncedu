package com.ncedu.groznova.simplewebtask.factsaboutnum;


public class IsPowerOfTwo implements FactAboutNum {

    @Override
    public boolean checkIs(int n) {
        return ((n > 0) && (((n-1) & n) == 0));
    }

    @Override
    public String property() {
        return "Is power of two";
    }
}
