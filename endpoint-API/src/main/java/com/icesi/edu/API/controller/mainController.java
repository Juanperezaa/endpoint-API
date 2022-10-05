package com.icesi.edu.API.controller;

import com.icesi.edu.API.dto.ClienteDTO;
import com.icesi.edu.API.api.mainAPI;
import com.icesi.edu.API.dto.DetalleDTO;
import com.icesi.edu.API.dto.FacturaDTO;
import com.icesi.edu.API.dto.ProductoDTO;
import com.icesi.edu.API.mapper.Mapper;
import com.icesi.edu.API.service.APIService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class mainController implements mainAPI {

    private final APIService service;
    private final Mapper mapper;

    @Override
    public DetalleDTO getDetalle(int idDetalle, int idFactura) {
        return mapper.detalleTODetalleDTO(service.valorFactura(idDetalle, idFactura));
    }

    @Override
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        return mapper.clienteToClienteDTO(service.nuevoCLiente(mapper.clienteDTOtoCliente(clienteDTO)));
    }

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        return mapper.productoToProductoDTO(service.nuevoProducto(mapper.productoDTOtoProducto(productoDTO)));
    }

    @Override
    public FacturaDTO createFactura(FacturaDTO facturaDTO) {
        return mapper.facturaTOFacturaDTO(service.nuevaFactura(mapper.facturaDTOtoFactura(facturaDTO)));
    }

    @Override
    public DetalleDTO createDetalle(DetalleDTO detalleDTO) {
        return mapper.detalleTODetalleDTO(service.nuevoDetalle(mapper.detalleDTOtoDetalle(detalleDTO)));
    }

}
