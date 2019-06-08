package com.cp.eticket.controller;

import com.cp.eticket.model.Travel;
import com.cp.eticket.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by bga_s on 09.06.2019.
 */
@RestController
@RequestMapping(value = "/travel")
public class TravelController {

    @Autowired
    TravelService travelService;

    @PostMapping(value = "/new")
    public ResponseEntity<Travel> addTravel(@RequestBody Travel travel){
        travelService.persistTravel(travel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
