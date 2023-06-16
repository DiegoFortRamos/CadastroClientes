package org.example;

import org.example.dao.ClienteDao;
import org.example.dao.EnderecoDao;
import org.example.modelo.Cliente;
import org.example.modelo.Endereco;
import org.example.utlil.JpaUtil;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Brasil","Rio de Janeiro","Mesquita","Cosmorama","2659845");
        Cliente  cliente = new Cliente("Diego","Ramos","Dev",endereco);

        EntityManager em = JpaUtil.getEntityManager();

        EnderecoDao enderecoDao = new EnderecoDao(em);
        ClienteDao clienteDao = new ClienteDao(em);


        em.getTransaction().begin();
        enderecoDao.cadastrar(endereco);
        clienteDao.cadastraCliente(cliente);
        em.getTransaction().commit();
        em.close();

    }
}