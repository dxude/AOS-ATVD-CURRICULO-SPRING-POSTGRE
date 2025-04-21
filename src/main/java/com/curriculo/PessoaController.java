package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoas")
@CrossOrigin(origins = "*") // permite que qualquer frontend acesse
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    // Criar nova pessoa
    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.salvarPessoa(pessoa);
    }

    // Listar todas as pessoas
    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarTodas();
    }

    // Buscar pessoa por ID
    @GetMapping("/{id}")
    public Optional<Pessoa> buscarPessoa(@PathVariable Long id) {
        return pessoaService.buscarPorId(id);
    }

    // Deletar pessoa por ID
    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id) {
        pessoaService.deletarPessoa(id);
    }

    // Atualizar pessoa por ID
    @PutMapping("/{id}")
    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) {
        return pessoaService.buscarPorId(id).map(pessoa -> {
            pessoa.setNome(pessoaAtualizada.getNome());
            pessoa.setEmail(pessoaAtualizada.getEmail());
            pessoa.setTelefone(pessoaAtualizada.getTelefone());
            pessoa.setResumo(pessoaAtualizada.getResumo());
            return pessoaService.salvarPessoa(pessoa);
        }).orElseGet(() -> {
            pessoaAtualizada.setId(id);
            return pessoaService.salvarPessoa(pessoaAtualizada);
        });
    }
}
