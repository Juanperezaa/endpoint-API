package com.icesi.edu.API.repository;

import com.icesi.edu.API.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
