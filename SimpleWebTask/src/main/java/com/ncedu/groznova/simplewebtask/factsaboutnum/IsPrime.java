package com.ncedu.groznova.simplewebtask.factsaboutnum;


public class IsPrime implements FactAboutNum {

    @Override
    public boolean checkIs(int n) {
        for (int p = 2; p < n; p++) {
            if ((n % p) == 0) { return false; }
        }
        return true;
    }

    @Override
    public String property() {
        return "Is prime";
    }
}
