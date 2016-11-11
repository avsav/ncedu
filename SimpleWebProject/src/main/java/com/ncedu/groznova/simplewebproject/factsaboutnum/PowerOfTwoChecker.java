package com.ncedu.groznova.simplewebproject.factsaboutnum;


public class PowerOfTwoChecker implements FactAboutNum {

    @Override
    public boolean check(int n) {
        return ((n > 0) && (((n-1) & n) == 0));
    }

    @Override
    public String property() {
        return "Is power of two";
    }
}
