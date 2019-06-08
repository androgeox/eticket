package com.cp.eticket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by bga_s on 08.06.2019.
 */
@Entity
//Перевозчик
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_Per;
    private String Name_per;

    public Provider() {
    }
}
