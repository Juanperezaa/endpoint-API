package com.icesi.edu.API.repository;

import com.icesi.edu.API.model.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Integer> {
}
