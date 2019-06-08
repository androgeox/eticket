package com.cp.eticket.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bga_s on 08.06.2019.
 */
@Entity
//Проездной документ
public class TravelDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customerId;
    private Integer tarifId;
    private Date startDate;
    private Date endDate;
    private Integer quantityOfTravel;
    private Integer TDbalance;
    private Integer TDendDate;

    public TravelDocument() {
    }
}
