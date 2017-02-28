package com.fererlab.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public static final String DAS_BOOT_REPORTING_FOR_DUTY = "Das boot, reporting for duty!";

    @RequestMapping("/")
    public String home(){
        return DAS_BOOT_REPORTING_FOR_DUTY;
    }

}
