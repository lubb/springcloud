package com.lbb.springcloud.eruakeclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/hi")
    public String index(){
        System.out.println("client");
        return ticketService.buyTicket();
    }
}
