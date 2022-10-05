package com.icesi.edu.API.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "detalle")
@IdClass(IdCompuesto.class)
public class Detalle {
    @Id
    private int numDetalle;
    @Id
    private int idFactura;
    @JsonIgnore
    @OneToOne
    @MapsId
    private Producto producto;
    public Detalle (Producto producto){
        this.producto = producto;
        producto.setIdProducto(this.producto.getIdProducto());
        producto.setNombre(this.producto.getNombre());
        producto.setPrecio(this.producto.getPrecio());
        producto.setStock(this.producto.getStock());
    }
    private int cantidad;
    private double precio;

}
