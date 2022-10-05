package com.icesi.edu.API.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@Table(name = "factura")
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    @Id
    @Column(name = "num_factura")
    private int numFactura;

    @Column(name = "id_cliente")
    private int idCliente;
    @JsonIgnore
    @OneToOne
    @MapsId
    private Cliente cliente;
    public Factura (Cliente cliente){
        this.cliente = cliente;
        cliente.setIdCliente(this.cliente.getIdCliente());
        cliente.setNombre(this.cliente.getNombre());
        cliente.setApellido(this.cliente.getApellido());
        cliente.setDireccion(this.cliente.getDireccion());
        cliente.setFechaNacimiento(this.cliente.getFechaNacimiento());
        cliente.setTelefono(this.cliente.getTelefono());
        cliente.setEmail(this.cliente.getEmail());
        cliente.setCategoria(this.cliente.getCategoria());
    }

    private Date fecha;

}
