package com.lbb.springcloud.sericefeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ticket12306Controller {

    @Autowired
    private Ticket12306Servoce ticket12306Servoce;

    @GetMapping(value = "/hi")
    public String sayHi() {
        System.out.println("feign");
        return ticket12306Servoce.ticket();
    }
}
