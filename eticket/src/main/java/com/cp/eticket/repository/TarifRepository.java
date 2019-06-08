package com.cp.eticket.repository;

import com.cp.eticket.model.Tarif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bga_s on 08.06.2019.
 */
@Repository
public interface TarifRepository extends CrudRepository<Tarif, Integer> {
}
