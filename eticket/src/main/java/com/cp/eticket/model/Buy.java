package com.cp.eticket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bga_s on 08.06.2019.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//Поездка
@Table(name = "Buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokupki")
    private Integer id;

    @Column(name = "fn_ns")
    private Integer fn_ns;

    @Column(name = "order_card_id")
    private Integer orderCardId;  //id_PS

    @Column(name = "travel_document_id")
    private Integer TravelDocumentId; //ID_PD

    @Column(name = "price")
    private Integer price;  //Sum

    @Column(name = "buy_date")
    @DateTimeFormat
    private Date buyDate;  //Date_Pokupki

}
