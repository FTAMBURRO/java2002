package com.coderhouse.demo.services;

import com.coderhouse.demo.model.Cliente;
import com.coderhouse.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Otros métodos si necesitas
}
