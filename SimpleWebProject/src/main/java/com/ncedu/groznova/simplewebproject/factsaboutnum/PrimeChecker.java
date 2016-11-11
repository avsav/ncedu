package com.ncedu.groznova.simplewebproject.factsaboutnum;


public class PrimeChecker implements FactAboutNum {

    @Override
    public boolean check(int n) {
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
