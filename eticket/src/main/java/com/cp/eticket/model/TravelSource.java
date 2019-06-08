package com.cp.eticket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by bga_s on 08.06.2019.
 */
@Entity
//Транспортное средство
public class TravelSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_TS;
    private Integer id_Per;
    private String type_TS;
    private Integer n_TS;
    private Integer n_tel_TS;
    private Integer n_marsh;

    public TravelSource() {
    }
}
