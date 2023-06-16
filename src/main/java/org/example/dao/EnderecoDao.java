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

    public void remover(Endereco endereco){
        em.merge(endereco);
        em.remove(endereco);
    }
}
