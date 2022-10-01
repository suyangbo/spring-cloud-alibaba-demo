package com.cloud.cloud01.feign;

import com.cloud.cloud01.fallback.Cloud01Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "suyang-cloud01", fallbackFactory = Cloud01Fallback.class)
public interface Cloud01Feign {

    @RequestMapping(value = "/suyang/cloud01/first", method = RequestMethod.POST)
    String first();

}
