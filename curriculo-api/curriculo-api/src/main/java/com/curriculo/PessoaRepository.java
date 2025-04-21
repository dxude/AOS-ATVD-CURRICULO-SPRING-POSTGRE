package com.curriculo;

import org.springframework.data.jpa.repository.JpaRepository;

// Repositório da entidade Pessoa
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Aqui você pode criar métodos personalizados se quiser, como:
    // List<Pessoa> findByNome(String nome);
}
