package com.curriculo;

import jakarta.persistence.*;

@Entity
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nivel;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")  
    private Pessoa pessoa;


    public Habilidade() {
    }

    public Habilidade(String nome, String nivel, Pessoa pessoa) {
        this.nome = nome;
        this.nivel = nivel;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
