package com.example.Atv_Casa.controller;

import com.example.Atv_Casa.model.FuncionarioModel;
import com.example.Atv_Casa.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<FuncionarioModel> listar(){
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar (@RequestBody FuncionarioModel funcionarioModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Funcionario Cadastrado com Sucesso",
                "funcionario",funcionarioService.salvar(funcionarioModel)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@RequestBody Long id, FuncionarioModel funcionarioModel){
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Funcionario Atualizado com Sucesso",
                "funcionario",funcionarioService.atualizar(id, funcionarioModel)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir (Long id){
        funcionarioService.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Funcionario Excluido com Sucesso"));
    }
}
