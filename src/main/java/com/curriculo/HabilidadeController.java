package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/habilidades")
@CrossOrigin("*")
public class HabilidadeController {

    @Autowired
    private HabilidadeService habilidadeService;

    @PostMapping
    public Habilidade criar(@RequestBody Habilidade habilidade) {
        return habilidadeService.salvarHabilidade(habilidade);
    }

    @GetMapping
    public List<Habilidade> listarTodas() {
        return habilidadeService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Habilidade> buscarPorId(@PathVariable Long id) {
        return habilidadeService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        habilidadeService.deletarHabilidade(id);
    }
}
