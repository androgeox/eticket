package com.cp.eticket.service;

import com.cp.eticket.model.Buy;
import com.cp.eticket.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by bga_s on 09.06.2019.
 */
@Service
public class TicketService {

    @Autowired
    BuyRepository buyRepository;

    public Optional<Buy> getTicket(Integer id){
       return buyRepository.findById(id);
    }

}
