package com.cp.eticket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by bga_s on 08.06.2019.
 */
@Entity
//Тарифный план
public class Tarif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer quantityOfTravel;
    private Date date;
    private String trasportType;
    private  Integer cost;
    private  Integer priceOfOneTravel;

    public Tarif() {
    }
}
