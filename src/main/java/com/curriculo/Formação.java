package com.curriculo;

import jakarta.persistence.*;

@Entity
public class Formação {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String instituicao;
    private String curso;
    private String anoConclusao;

    @ManyToOne
    @JoinColumn(name = "pessoa_id") 
    private Pessoa pessoa;

    public Formação() {
    }

    
    public Formação(String instituicao, String curso, String anoConclusao, Pessoa pessoa) {
        this.instituicao = instituicao;
        this.curso = curso;
        this.anoConclusao = anoConclusao;
        this.pessoa = pessoa;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
