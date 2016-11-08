package com.ncedu.groznova.simplewebtask.factsaboutnum;


public class IsLeonardoSeq implements FactAboutNum {

    /*
      The Leonardo numbers are a sequence of numbers given by the recurrence:
             | 1, if n = 0
      L(n) = | 1, if n = 1
             | L(n - 1) + L(n - 2) + 1, if n > 1
    */
    @Override
    public boolean checkIs(int n) {
        if (n == 1) return true;
        int prev = 1;
        int curr = 1;
        int next = prev + curr + 1;

        while (next < n) {
            prev = curr;
            curr = next;
            next = prev + curr + 1;
        }
        return (next == n);
    }

    @Override
    public String property() {
        return "Is Leonardo number";
    }
}
