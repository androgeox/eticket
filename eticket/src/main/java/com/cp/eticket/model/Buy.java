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
//Поездка
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pokupki;
    private Integer fn_ns;
    private Integer orderCardId;  //id_PS
    private Integer TravelDocumentId; //ID_PD
    private Integer price;  //Sum
    private Date buyDate;  //Date_Pokupki

    public Buy() {
    }
}
