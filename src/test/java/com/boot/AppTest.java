package com.boot;

import com.boot.controller.HomeController;
import static org.junit.Assert.assertEquals;

public class AppTest{

    @org.junit.Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result= hc.home();
        assertEquals(result,"Das boot");
    }
}
