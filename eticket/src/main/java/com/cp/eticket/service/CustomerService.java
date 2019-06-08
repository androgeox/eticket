package com.cp.eticket.service;

import com.cp.eticket.model.Customer;
import com.cp.eticket.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by bga_s on 08.06.2019.
 */
@Service
@Transactional
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Optional<Customer> getCustomer(Integer id){
        Optional<Customer> byId = customerRepository.findById(id);
        return byId;
    }
}
