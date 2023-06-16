package org.example.modelo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String ocupacao;

    @OneToOne
    private Endereco endereco;

    private LocalDate dataCadastrada = LocalDate.now();



    public Cliente(String nome,String sobrenome,String ocupacao,Endereco endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.ocupacao = ocupacao;

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public LocalDate getDataCadastrada() {
        return dataCadastrada;
    }
}
