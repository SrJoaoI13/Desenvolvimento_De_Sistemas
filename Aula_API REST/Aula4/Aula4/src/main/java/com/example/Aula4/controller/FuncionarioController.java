package com.example.Aula4.controller;
// pesquida spring mysql

import com.example.Aula4.model.Funcionario;
import com.example.Aula4.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {

    @Autowired
        private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listartodos(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
