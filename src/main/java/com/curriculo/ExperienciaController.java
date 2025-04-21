package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/experiencias")
@CrossOrigin("*")
public class ExperienciaController {

    @Autowired
    private ExperienciaService experienciaService;

    @PostMapping
    public Experiencia criar(@RequestBody Experiencia experiencia) {
        return experienciaService.salvarExperiencia(experiencia);
    }

    @GetMapping
    public List<Experiencia> listarTodas() {
        return experienciaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Experiencia> buscarPorId(@PathVariable Long id) {
        return experienciaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        experienciaService.deletarExperiencia(id);
    }
}
