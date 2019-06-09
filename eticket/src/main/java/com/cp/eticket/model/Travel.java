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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Travel")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Poezd;
    private Integer TSId;  //ТС
    private Integer TDId; //проездной документ
    @DateTimeFormat
    private Date Date_Poezd;
    private Integer costTravel;
    private String vid_plat;

}
