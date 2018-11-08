package com.lbb.springcloud.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements Ticket12306Servoce {

    @Override
    public String ticket() {
        return "sorry isorry~!!!";
    }
}
