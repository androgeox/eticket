package com.cp.eticket.controller;

import com.cp.eticket.model.Buy;
import com.cp.eticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by bga_s on 09.06.2019.
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/ticket/{id}", method = RequestMethod.GET)
    public Optional<Buy> getTicket(@PathVariable Integer id){
        return ticketService.getTicket(id);
    }
}
