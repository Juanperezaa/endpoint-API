package com.icesi.edu.API.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Builder
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    private int idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    private String telefono;
    private String email;
    private String categoria;
}
