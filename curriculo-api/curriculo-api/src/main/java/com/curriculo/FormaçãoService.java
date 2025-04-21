package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaçãoService {

    @Autowired
    private FormaçãoRepository formacaoRepository;

    public Formação salvarFormacao(Formação formacao) {
        return formacaoRepository.save(formacao);
    }

    public List<Formação> listarTodas() {
        return formacaoRepository.findAll();
    }

    public Optional<Formação> buscarPorId(Long id) {
        return formacaoRepository.findById(id);
    }

    public void deletarFormacao(Long id) {
        formacaoRepository.deleteById(id);
    }
}
