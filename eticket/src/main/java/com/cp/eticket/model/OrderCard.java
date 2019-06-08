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
public class OrderCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String name;
    private Integer number;
    private String owner;
    private Date endDate;

    public OrderCard() {
    }
}
