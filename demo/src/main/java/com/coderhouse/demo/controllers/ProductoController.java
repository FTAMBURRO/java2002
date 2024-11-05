package com.coderhouse.demo.controllers;

import com.coderhouse.demo.model.Producto;
import com.coderhouse.demo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.obtenerTodos();
    }

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }
}
