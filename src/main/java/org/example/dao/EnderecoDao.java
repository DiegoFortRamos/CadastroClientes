package org.example.dao;

import org.example.modelo.Endereco;

import javax.persistence.EntityManager;

public class EnderecoDao {
    public EntityManager em;

    public EnderecoDao(EntityManager em){
        this.em = em;
    }

    public void cadastrar(Endereco endereco){
        em.persist(endereco);
    }
}
