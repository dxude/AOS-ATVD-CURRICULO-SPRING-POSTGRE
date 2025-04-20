package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/formacoes")
@CrossOrigin("*")
public class FormaçãoController {

    @Autowired
    private FormaçãoService formacaoService;

    @PostMapping
    public Formação criar(@RequestBody Formação formacao) {
        return formacaoService.salvarFormacao(formacao);
    }

    @GetMapping
    public List<Formação> listarTodas() {
        return formacaoService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Formação> buscarPorId(@PathVariable Long id) {
        return formacaoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        formacaoService.deletarFormacao(id);
    }
}
