package com.example.Aula6.service;

import com.example.Aula6.model.Aluno;
import com.example.Aula6.repository.AlunoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.Vector;

@Repository
public class AlunoService {

    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    //GET READ
    public  List<Aluno> listarTodos(){
       return alunoRepository.findAll();
    }

    // POS - CREATE
    public Aluno salvar(Aluno aluno){
        if(alunoRepository.findByemail(aluno.getEmail()).isPresent()){
            throw new RuntimeException("Aluno cadastrado");
        }
        return alunoRepository.save(aluno);
    }

    // PUT - UPDATE
    public Aluno atualizar(UUID id, Aluno aluno){
        if (alunoRepository.existsById(id)){
            throw new RuntimeException("Cliente cadastrado");
        }
        aluno.setId(id);
        Aluno alunoatualizar = alunoRepository.save(aluno);
        return alunoatualizar;
    }

    //DELETE
    public void excluir(UUID id){
        if (alunoRepository.existsById(id)){
            throw new RuntimeException("Cliente deletado com sucesso");
        }
        alunoRepository.deleteById(id);
    }
}
