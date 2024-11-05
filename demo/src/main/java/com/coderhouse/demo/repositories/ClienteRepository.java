package com.coderhouse.demo.repositories;

import com.coderhouse.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
