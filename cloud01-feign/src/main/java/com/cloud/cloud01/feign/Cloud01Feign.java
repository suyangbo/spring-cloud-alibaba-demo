package com.cloud.cloud01.feign;

import com.cloud.cloud01.fallback.Cloud01Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "suyang-cloud01", fallbackFactory = Cloud01Fallback.class)
public interface Cloud01Feign {

    @RequestMapping("/aa")
    void aa();

}
