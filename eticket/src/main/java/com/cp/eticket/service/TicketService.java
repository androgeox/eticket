package com.cp.eticket.service;

import com.cp.eticket.model.Buy;
import com.cp.eticket.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by bga_s on 09.06.2019.
 */
@Service
@Transactional
public class TicketService {

    @Autowired
    BuyRepository buyRepository;

    public Optional<Buy> getTicket(Integer id){
        Optional<Buy> byId = buyRepository.findById(id);
        return byId;
    }

}
