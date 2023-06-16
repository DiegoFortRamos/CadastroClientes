package org.example.dao;

import org.example.modelo.Cliente;

import javax.persistence.EntityManager;

public class ClienteDao {

    private EntityManager em;

    public ClienteDao(EntityManager em){
        this.em = em;
    }

    public void cadastraCliente(Cliente cliente){
        em.persist(cliente);
    }


}
