package com.cloud.cloud01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cloud01Controller {

    @RequestMapping("/aa")
    public void aa() {
        System.out.println("aa");
    }

}
