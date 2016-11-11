package com.ncedu.groznova.simplewebproject;

import com.ncedu.groznova.simplewebproject.mathparser.MathParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
public class ClassController {

    private Classifier classifire = new Classifier();

    @Autowired
    public void setClassifire(Classifier classifire) {
        this.classifire = classifire; // Classifier injection
    }

    @RequestMapping(value = {"/factsAboutNum/"}, method = RequestMethod.GET)
    public String getFactsAboutNum(@RequestParam(value = "expr", required = false) String expr, Map<String, Object> model) {
        if (expr == null || expr.isEmpty()) {
            return "facts";
        }

        try {
            model.put("expr", expr);
            MathParser mp = new MathParser();
            double n = mp.Parse(expr);
            model.put("res", (int)n);
            model.put("facts", classifire.mapp((int)n));
        } catch (Exception e) {
            e.printStackTrace();
            model.put("invalid", expr.toString() + " Incorrect expression format!");
            return "invalid";
        }

        return "facts";
    }
}
