package com.example.Atv_Casa.service;

import com.example.Atv_Casa.model.FuncionarioModel;
import com.example.Atv_Casa.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    public List<FuncionarioModel> lisatarTodos(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionarioModel){
        if(funcionarioRepository.findBymatricula(funcionarioModel.getMatricula()).isPresent()){
            throw  new IllegalArgumentException("funcionario ja Cadastrado");
        }
        return funcionarioRepository.save(funcionarioModel);
    }

    public FuncionarioModel atualizar(Long id,FuncionarioModel funcionarioModel){
        if(!funcionarioRepository.existsById(id)){
            throw  new RuntimeException("funcionario não encontrado");
        }
        return funcionarioRepository.save(funcionarioModel);
    }

    public void deletar(Long id){
        if(!funcionarioRepository.existsById(id)){
            throw  new RuntimeException("funcionario não encontrado");
        }
        funcionarioRepository.deleteById(id);
    }

    public List<FuncionarioModel> listarTodos() {
        return null;
    }

}
