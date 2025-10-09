package com.example.aula_9.service;

import com.example.aula_9.model.FuncionarioModel;
import com.example.aula_9.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> listarTodos(){
        return funcionarioRepository.findAll();
    }

    public  FuncionarioModel salvar(FuncionarioModel funcionarioModel){
        if (funcionarioRepository.findByemail(funcionarioModel.getEmail()).isPresent()){
            throw new RuntimeException("Funcionario Ja Cadastrado");

        }
     return funcionarioRepository.save(funcionarioModel);
    }

    public  FuncionarioModel atualizar (Long id,FuncionarioModel funcionarioModel ){
        if (funcionarioRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionario não encontrado");
        }
        funcionarioModel.setId(id);
            return funcionarioRepository.save(funcionarioModel);
    }

    public void excluir(Long id){
        if (!funcionarioRepository.existsById(id)){
            throw new IllegalArgumentException("Funcionario não encontrado");
        }

         funcionarioRepository.deleteById(id);
    }

}
