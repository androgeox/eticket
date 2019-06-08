package com.cp.eticket.controller;

import com.cp.eticket.model.Customer;
import com.cp.eticket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;

/**
 * Created by bga_s on 08.06.2019.
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Optional<Customer> getCustomers(@PathVariable Integer id){
        return customerService.getCustomer(id);
    }
}
