package com.coderhouse.model; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EjemploInsertar {
    public static void main(String[] args) {
        // Crear el EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("venta_db");
        EntityManager em = emf.createEntityManager();

        // Iniciar una transacción
        em.getTransaction().begin();

        // Crear una nueva entidad (ejemplo)
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre("Juan Gomes");
        nuevoCliente.setEmail("juancitoGomez@example.com");
        nuevoCliente.setDireccion("Calle Falsa 663");
        nuevoCliente.setTelefono("12345367895");

        // Persistir la nueva entidad
        em.persist(nuevoCliente);

        // Confirmar la transacción
        em.getTransaction().commit();

        // Cerrar el EntityManager y el EntityManagerFactory
        em.close();
        emf.close();

        System.out.println("Cliente insertado correctamente.");
    }
}
