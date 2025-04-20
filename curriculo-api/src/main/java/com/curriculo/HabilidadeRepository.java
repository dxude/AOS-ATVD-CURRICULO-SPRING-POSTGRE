package com.curriculo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {
    // Consultas customizadas podem ser adicionadas aqui, se necessário
}
