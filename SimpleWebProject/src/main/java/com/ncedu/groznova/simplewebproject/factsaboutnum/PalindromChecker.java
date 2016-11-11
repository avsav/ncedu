package com.ncedu.groznova.simplewebproject.factsaboutnum;


public class PalindromChecker implements FactAboutNum {

    @Override
    public boolean check(int n) {
        String str = Integer.toString(n);
        return str.equals(new StringBuilder().append(str).reverse().toString());
    }

    @Override
    public String property() {
        return "Is palindrom";
    }
}
