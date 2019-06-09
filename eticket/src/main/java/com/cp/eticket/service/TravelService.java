package com.cp.eticket.service;

import com.cp.eticket.model.Travel;
import com.cp.eticket.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by bga_s on 09.06.2019.
 */
@Service
@Transactional
public class TravelService {

    @Autowired
    TravelRepository travelRepository;

    public Optional<Travel> getTravel(Integer id){
        Optional<Travel> byId = travelRepository.findById(id);
        return byId;
    }

    public void persistTravel(Travel travel){
        travelRepository.save(travel);
    }
}
