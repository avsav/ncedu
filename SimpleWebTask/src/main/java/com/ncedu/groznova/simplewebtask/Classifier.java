package com.ncedu.groznova.simplewebtask;


import com.ncedu.groznova.simplewebtask.factsaboutnum.FactAboutNum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classifier {

    private List<FactAboutNum> factsAboutNum;

    public void setFactsAboutNum(List<FactAboutNum> factsAboutNum) {
        this.factsAboutNum = factsAboutNum;
    }

    public Map<String, Boolean> mapp(int n) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (FactAboutNum factAboutNum: factsAboutNum) {
            map.put(factAboutNum.property(), factAboutNum.checkIs(n));
        }
        return map;
    }
}
