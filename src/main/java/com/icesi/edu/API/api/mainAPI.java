package com.icesi.edu.API.api;

import com.icesi.edu.API.dto.ClienteDTO;
import com.icesi.edu.API.dto.DetalleDTO;
import com.icesi.edu.API.dto.FacturaDTO;
import com.icesi.edu.API.dto.ProductoDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/API")
public interface mainAPI {


    @GetMapping("/detalle/{num_detalle}/{id_factura}")
    DetalleDTO getDetalle(@PathVariable(name = "num_detalle") int idDetalle, @PathVariable(name="id_factura") int idFactura);

    @PostMapping("/factura")
    FacturaDTO createFactura(@RequestBody FacturaDTO facturaDTO);

    @PostMapping("/detalle")
    DetalleDTO createDetalle(@RequestBody DetalleDTO detalleDTO);

    @PostMapping("/producto")
    ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO);

    @PostMapping("/cliente")
    ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO);





}
