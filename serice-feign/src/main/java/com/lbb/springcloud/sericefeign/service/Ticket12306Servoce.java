package com.lbb.springcloud.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface Ticket12306Servoce {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String ticket();
}
