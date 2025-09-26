package com.example.Aula6.controller;

import com.example.Aula6.model.Aluno;
import com.example.Aula6.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService){
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listartodos(){
        return alunoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno){
        alunoService.salvar(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(
            @PathVariable UUID id,
            @RequestBody Aluno aluno){
        alunoService.atualizar(id, aluno);
        return  ResponseEntity.status(HttpStatus.OK).body(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(UUID id){
        alunoService.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
