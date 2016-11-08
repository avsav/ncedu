package com.ncedu.groznova.simplewebtask.factsaboutnum;


public class IsPalindrom implements FactAboutNum {

    @Override
    public boolean checkIs(int n) {
        String str = Integer.toString(n);
        return str.equals(new StringBuilder().append(str).reverse().toString());
    }

    @Override
    public String property() {
        return "Is palindrom";
    }
}
