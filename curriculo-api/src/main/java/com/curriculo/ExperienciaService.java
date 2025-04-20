package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public Experiencia salvarExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    public List<Experiencia> listarTodas() {
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> buscarPorId(Long id) {
        return experienciaRepository.findById(id);
    }

    public void deletarExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }
}
