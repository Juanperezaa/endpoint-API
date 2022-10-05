package com.icesi.edu.API.model;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class IdCompuesto implements Serializable {
    private int numDetalle;
    private int idFactura;
}
