package com.example.Atv_Casa.service;

import com.example.Atv_Casa.model.ClienteModel;
import com.example.Atv_Casa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> listarTodosClientes(){
     return clienteRepository.findAll();
    }

    public ClienteModel salvar(ClienteModel clienteModel){
        if (clienteRepository.findByemail(clienteModel.getEmail()).isPresent()){
            throw  new IllegalArgumentException("Cliente ja Cadastrado");
        }
        return clienteRepository.save(clienteModel);
    }

     public  ClienteModel atualizar(Long id,ClienteModel clienteModel){
        if (!clienteRepository.existsById(id)){
            throw  new RuntimeException("Cliente não encontrado");
        }
        clienteModel.setId(id);
        return clienteRepository.save(clienteModel);
     }


    public void excluir(Long id){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente nao encontrado");
        }
        clienteRepository.deleteById(id);
    }









}
