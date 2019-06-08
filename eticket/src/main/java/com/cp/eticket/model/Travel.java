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
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Poezd;
    private Integer TSId;  //ТС
    private Integer TDId; //проездной документ
    private Date Date_Poezd;
    private Integer costTravel;
    private String vid_plat;

    public Travel() {
    }
}
