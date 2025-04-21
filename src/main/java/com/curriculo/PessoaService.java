package com.curriculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    // Salva ou atualiza uma pessoa
    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    // Retorna todas as pessoas cadastradas
    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    // Busca uma pessoa pelo ID
    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    // Deleta uma pessoa pelo ID
    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}
