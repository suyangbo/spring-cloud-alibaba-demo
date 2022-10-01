package com.cloud.cloud01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cloud01YxController {
    @PostMapping("info")
    public String demo(){
        return "有点东西！";
    }
}
