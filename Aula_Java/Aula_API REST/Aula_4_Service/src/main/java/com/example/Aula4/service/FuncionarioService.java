package com.example.Aula4.service;

import com.example.Aula4.model.Funcionario;
import com.example.Aula4.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    private FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    //GET
    public List<Funcionario> listartodos(){
        return funcionarioRepository.findAll();
    }

    //POST
    public  Funcionario salvar (Funcionario funcionario) {
        //verificar se o funcionario esta cadastrado
        if (funcionarioRepository.findBytelefone(funcionario.getTelefone()).isPresent()) {
            // se encontra o telefone no banco de dados, mostra:
            throw new RuntimeException("Funcionario cadastrado");
        }
        //se não encontra no banco salvar
    return funcionarioRepository.save(funcionario);
        }

}
