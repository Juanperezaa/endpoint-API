package com.icesi.edu.API.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @Column(name = "id_producto")
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

}
