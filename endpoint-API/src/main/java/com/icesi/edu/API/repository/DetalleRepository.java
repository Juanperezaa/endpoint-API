package com.icesi.edu.API.repository;

import com.icesi.edu.API.model.Detalle;
import com.icesi.edu.API.model.IdCompuesto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends CrudRepository<Detalle, IdCompuesto> {

}
