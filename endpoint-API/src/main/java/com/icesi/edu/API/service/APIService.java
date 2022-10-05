package com.icesi.edu.API.service;

import com.icesi.edu.API.model.Cliente;
import com.icesi.edu.API.model.Detalle;
import com.icesi.edu.API.model.Factura;
import com.icesi.edu.API.model.Producto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface APIService {

    Detalle valorFactura(@PathVariable int idDetalle, @PathVariable int idFactura);
    Factura nuevaFactura(@RequestBody Factura facturaDTO);
    Detalle nuevoDetalle(@RequestBody Detalle detalleDTO);
    Producto nuevoProducto(@RequestBody Producto productoDTO);
    Cliente nuevoCLiente(@RequestBody Cliente clienteDTO);







}
