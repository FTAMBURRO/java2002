package com.coderhouse.demo.controllers;

import com.coderhouse.demo.model.Cliente;
import com.coderhouse.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.obtenerTodos();
    }

    @PostMapping
    public Cliente agregarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardar(cliente);
    }
}
