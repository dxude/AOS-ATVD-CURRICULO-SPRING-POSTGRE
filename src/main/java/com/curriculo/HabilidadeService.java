package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabilidadeService {

    @Autowired
    private HabilidadeRepository habilidadeRepository;

    public Habilidade salvarHabilidade(Habilidade habilidade) {
        return habilidadeRepository.save(habilidade);
    }

    public List<Habilidade> listarTodas() {
        return habilidadeRepository.findAll();
    }

    public Optional<Habilidade> buscarPorId(Long id) {
        return habilidadeRepository.findById(id);
    }

    public void deletarHabilidade(Long id) {
        habilidadeRepository.deleteById(id);
    }
}
