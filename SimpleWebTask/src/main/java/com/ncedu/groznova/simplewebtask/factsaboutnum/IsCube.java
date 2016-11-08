package com.ncedu.groznova.simplewebtask.factsaboutnum;


public class IsCube implements FactAboutNum {

    @Override
    public boolean checkIs(int n) {
        return (Math.cbrt(n) == Math.floor(Math.cbrt(n)));
    }

    @Override
    public String property() {
        return "Is cube";
    }
}
