package com.example.Aula4.controller;

import com.example.Aula4.model.Funcionario;
import com.example.Aula4.service.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public  FuncionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }


    @GetMapping
    public  List<Funcionario> ListarFuncionario(){
        return funcionarioService.listartodos();
    }

    @PostMapping
    public ResponseEntity<Funcionario> salvarFuncionario(@RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}
