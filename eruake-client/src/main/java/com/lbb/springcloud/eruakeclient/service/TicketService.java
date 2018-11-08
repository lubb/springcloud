package com.lbb.springcloud.eruakeclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Value("${server.port}")
    String port;

    public String buyTicket(){
        System.out.println("我是port:"+port);
        return "《疯狂的石头》";
    }

}
