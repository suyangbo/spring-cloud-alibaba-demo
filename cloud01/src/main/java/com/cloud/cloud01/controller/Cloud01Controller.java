package com.cloud.cloud01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/suyang/cloud01")
public class Cloud01Controller {

    @RequestMapping(value = "/first", method = RequestMethod.POST)
    public String first() {
        String s = "first!!!!";
        log.info(s);
        return s;
    }

}
