package com.fererlab.controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

    @Test
    public void testHome() throws Exception {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(HomeController.DAS_BOOT_REPORTING_FOR_DUTY, result);
    }
}