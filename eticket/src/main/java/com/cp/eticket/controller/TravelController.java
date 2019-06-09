package com.cp.eticket.controller;

import com.cp.eticket.model.Travel;
import com.cp.eticket.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by bga_s on 09.06.2019.
 */
@RestController
public class TravelController {

    @Autowired
    TravelService travelService;

    @RequestMapping(value = "/travel/new",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Travel> addTravel(@RequestBody Travel travel){
        travelService.persistTravel(travel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping(value = "/travel/{id}", method = RequestMethod.GET)
    public Optional<Travel> getCustomers(@PathVariable Integer id){
        return travelService.getTravel(id);
    }

}
