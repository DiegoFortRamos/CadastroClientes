package org.example.modelo;

import javax.persistence.*;

@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String cep;



    public Endereco(String pais,String estado,String cidade,String bairro,String cep){
        this.pais = pais;
        this.cidade = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }
}
