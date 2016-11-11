package com.ncedu.groznova.simplewebproject;


import com.ncedu.groznova.simplewebproject.factsaboutnum.FactAboutNum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Classifier {

    private List<FactAboutNum> factsAboutNum = new LinkedList<FactAboutNum>();

    public void setFactsAboutNum(List<FactAboutNum> factsAboutNum) {
        this.factsAboutNum = factsAboutNum;
    }

    public Map<String, Boolean> mapp(int n) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (FactAboutNum factAboutNum: factsAboutNum) {
            map.put(factAboutNum.property(), factAboutNum.check(n));
        }
        return map;
    }
}
