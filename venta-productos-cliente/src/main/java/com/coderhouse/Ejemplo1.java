package com.coderhouse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejemplo1 {
    public static void main(String[] args) {
        // Crear una instancia de EntityManagerFactory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("venta_db");
        // Crear un EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Iniciar una transacción
        entityManager.getTransaction().begin();

        // Puedes agregar aquí la lógica para crear un cliente, producto o venta si lo deseas.
        
        // Finalizar la transacción
        entityManager.getTransaction().commit();

        // Cerrar el EntityManager y la EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Tablas generadas correctamente.");
    }
}
