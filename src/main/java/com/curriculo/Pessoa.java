package com.curriculo;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String resumo;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Experiencia> experiencias;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Formação> formacoes;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Habilidade> habilidades;

    // Construtores, getters e setters
    public Pessoa() {}

    public Pessoa(String nome, String email, String telefone, String resumo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.resumo = resumo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public List<Formação> getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(List<Formação> formacoes) {
        this.formacoes = formacoes;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}
