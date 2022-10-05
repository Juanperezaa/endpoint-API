package com.icesi.edu.API.mapper;

import com.icesi.edu.API.dto.ClienteDTO;
import com.icesi.edu.API.dto.DetalleDTO;
import com.icesi.edu.API.dto.FacturaDTO;
import com.icesi.edu.API.dto.ProductoDTO;
import com.icesi.edu.API.model.Cliente;
import com.icesi.edu.API.model.Detalle;
import com.icesi.edu.API.model.Factura;
import com.icesi.edu.API.model.Producto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T10:46:43-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class MapperImpl implements Mapper {

    @Override
    public Cliente clienteDTOtoCliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.nombre( clienteDTO.getNombre() );
        cliente.apellido( clienteDTO.getApellido() );
        cliente.direccion( clienteDTO.getDireccion() );
        cliente.fechaNacimiento( clienteDTO.getFechaNacimiento() );
        cliente.telefono( clienteDTO.getTelefono() );
        cliente.email( clienteDTO.getEmail() );
        cliente.categoria( clienteDTO.getCategoria() );

        return cliente.build();
    }

    @Override
    public ClienteDTO clienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO.ClienteDTOBuilder clienteDTO = ClienteDTO.builder();

        clienteDTO.nombre( cliente.getNombre() );
        clienteDTO.apellido( cliente.getApellido() );
        clienteDTO.direccion( cliente.getDireccion() );
        clienteDTO.fechaNacimiento( cliente.getFechaNacimiento() );
        clienteDTO.telefono( cliente.getTelefono() );
        clienteDTO.email( cliente.getEmail() );
        clienteDTO.categoria( cliente.getCategoria() );

        return clienteDTO.build();
    }

    @Override
    public Producto productoDTOtoProducto(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto.ProductoBuilder producto = Producto.builder();

        producto.idProducto( productoDTO.getIdProducto() );
        producto.nombre( productoDTO.getNombre() );
        producto.precio( productoDTO.getPrecio() );
        producto.stock( productoDTO.getStock() );

        return producto.build();
    }

    @Override
    public ProductoDTO productoToProductoDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO.ProductoDTOBuilder productoDTO = ProductoDTO.builder();

        productoDTO.idProducto( producto.getIdProducto() );
        productoDTO.nombre( producto.getNombre() );
        productoDTO.precio( producto.getPrecio() );
        productoDTO.stock( producto.getStock() );

        return productoDTO.build();
    }

    @Override
    public Factura facturaDTOtoFactura(FacturaDTO facturaDTO) {
        if ( facturaDTO == null ) {
            return null;
        }

        Factura.FacturaBuilder factura = Factura.builder();

        factura.numFactura( facturaDTO.getNumFactura() );
        factura.idCliente( facturaDTO.getIdCliente() );
        factura.fecha( facturaDTO.getFecha() );

        return factura.build();
    }

    @Override
    public FacturaDTO facturaTOFacturaDTO(Factura factura) {
        if ( factura == null ) {
            return null;
        }

        FacturaDTO.FacturaDTOBuilder facturaDTO = FacturaDTO.builder();

        facturaDTO.numFactura( factura.getNumFactura() );
        facturaDTO.idCliente( factura.getIdCliente() );
        facturaDTO.fecha( factura.getFecha() );

        return facturaDTO.build();
    }

    @Override
    public Detalle detalleDTOtoDetalle(DetalleDTO detalleDTO) {
        if ( detalleDTO == null ) {
            return null;
        }

        Detalle.DetalleBuilder detalle = Detalle.builder();

        detalle.numDetalle( detalleDTO.getNumDetalle() );
        detalle.cantidad( detalleDTO.getCantidad() );
        detalle.precio( detalleDTO.getPrecio() );

        return detalle.build();
    }

    @Override
    public DetalleDTO detalleTODetalleDTO(Detalle detalle) {
        if ( detalle == null ) {
            return null;
        }

        DetalleDTO.DetalleDTOBuilder detalleDTO = DetalleDTO.builder();

        detalleDTO.numDetalle( detalle.getNumDetalle() );
        detalleDTO.cantidad( detalle.getCantidad() );
        detalleDTO.precio( detalle.getPrecio() );

        return detalleDTO.build();
    }
}
