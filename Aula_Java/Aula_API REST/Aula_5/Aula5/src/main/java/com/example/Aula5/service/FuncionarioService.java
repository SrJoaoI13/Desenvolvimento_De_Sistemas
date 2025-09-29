package com.example.Aula5.service;

import com.example.Aula5.model.Funcionario;
import com.example.Aula5.repository.FuncionarioRepository;
import com.example.Aula5.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    private FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    //GET
    @GetMapping
    public List<Funcionario> listartodos(){
        return funcionarioRepository.findAll();
    }

    //POST
    @PostMapping
    public Funcionario salvar (Funcionario funcionario){
        if(funcionarioRepository.findBycpf(funcionario.getCpf()).isPresent()){
            throw new RuntimeException("Funcionario Cadastrado");
        }
        //se não encontra no banco salvar
        return funcionarioRepository.save(funcionario);
    }
}
