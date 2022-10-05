package com.icesi.edu.API.mapper;

import com.icesi.edu.API.dto.ClienteDTO;
import com.icesi.edu.API.dto.DetalleDTO;
import com.icesi.edu.API.dto.FacturaDTO;
import com.icesi.edu.API.dto.ProductoDTO;
import com.icesi.edu.API.model.Cliente;
import com.icesi.edu.API.model.Detalle;
import com.icesi.edu.API.model.Factura;
import com.icesi.edu.API.model.Producto;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {

    Cliente clienteDTOtoCliente(ClienteDTO clienteDTO);

    ClienteDTO clienteToClienteDTO(Cliente cliente);

    Producto productoDTOtoProducto(ProductoDTO productoDTO);

    ProductoDTO productoToProductoDTO(Producto producto);

    Factura facturaDTOtoFactura(FacturaDTO facturaDTO);

    FacturaDTO facturaTOFacturaDTO(Factura factura);

    Detalle detalleDTOtoDetalle(DetalleDTO detalleDTO);

    DetalleDTO detalleTODetalleDTO(Detalle detalle);

}
