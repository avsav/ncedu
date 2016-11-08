package com.ncedu.groznova.simplewebtask;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.Map;


public class ClassControllerTest {

    @Test
    public void getFactsAboutNumTest() throws Exception {
        ClassController cc = new ClassController();
        Map<String, Object> model = Mockito.mock(Map.class);
        cc.getFactsAboutNum("1+4", model);
        Mockito.verify(model).put("res", 5);
    }
}
