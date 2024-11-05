package com.coderhouse.demo.repositories;

import com.coderhouse.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
