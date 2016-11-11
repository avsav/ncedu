package com.ncedu.groznova.simplewebproject.factsaboutnum;


public class CubeChecker implements FactAboutNum {

    @Override
    public boolean check(int n) {
        return (Math.cbrt(n) == Math.floor(Math.cbrt(n)));
    }

    @Override
    public String property() {
        return "Is cube";
    }
}
