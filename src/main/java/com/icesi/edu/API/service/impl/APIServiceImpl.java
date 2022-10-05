package com.icesi.edu.API.service.impl;

import com.icesi.edu.API.model.*;
import com.icesi.edu.API.repository.FacturaRepository;
import com.icesi.edu.API.repository.ProductoRepository;
import com.icesi.edu.API.repository.ClienteRepository;
import com.icesi.edu.API.repository.DetalleRepository;
import com.icesi.edu.API.service.APIService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
@Primary
public class APIServiceImpl implements APIService {

    private final ClienteRepository clienteRepository;
    private final FacturaRepository facturaRepository;
    private final ProductoRepository productoRepository;
    private final DetalleRepository detalleRepository;

    @Override
    public Detalle valorFactura(int numDetalle, int idFactura) {
        Detalle aux = detalleRepository.findById(new IdCompuesto(numDetalle, idFactura)).orElse(null);
        Optional<Factura> temp= facturaRepository.findById(idFactura);
        if((aux != null)&&(temp!=null)) {
            if(aux.getCantidad() >= 5 && aux.getPrecio() >= 1000000)
                aux.setPrecio(aux.getPrecio() * 0.9);
        }
        return aux;
    }
    @Override
    public Factura nuevaFactura(Factura facturaDTO) {
        return facturaRepository.save(facturaDTO);
    }
    @Override
    public Detalle nuevoDetalle(Detalle detalleDTO) {
        return detalleRepository.save(detalleDTO);
    }
    @Override
    public Producto nuevoProducto(Producto productoDTO) {
        return productoRepository.save(productoDTO);
    }
    @Override
    public Cliente nuevoCLiente(Cliente clienteDTO) {
        return clienteRepository.save(clienteDTO);
    }







}
