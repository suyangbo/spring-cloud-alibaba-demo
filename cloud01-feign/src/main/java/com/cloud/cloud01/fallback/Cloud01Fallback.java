package com.cloud.cloud01.fallback;

import com.cloud.cloud01.feign.Cloud01Feign;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Cloud01Fallback implements FallbackFactory<Cloud01Feign> {

    public Cloud01Feign create(Throwable throwable) {
        return new Cloud01Feign() {
            public String first() {
                log.error("first  服务降级fallback！！！");
                return "first  服务降级fallback！！！";
            }
        } ;
    }
}
