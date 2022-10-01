package com.cloud.cloud01.fallback;

import com.cloud.cloud01.feign.Cloud01Feign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class Cloud01Fallback implements FallbackFactory<Cloud01Feign> {

    public Cloud01Feign create(Throwable throwable) {
        return new Cloud01Feign() {
            public void aa() {
                System.out.println("aa 服务降级");
            }
        } ;
    }
}
