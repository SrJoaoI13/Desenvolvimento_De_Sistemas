package com.example.Aula6.service;

import com.example.Aula6.model.Cliente;
import com.example.Aula6.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    //GET READ
    public List<Cliente> lisatarTodos(){
        return clienteRepository.findAll();
}

    // POS - CREATE
     public  Cliente salvar(Cliente cliente) {
         if (clienteRepository.findByemail(cliente.getEmail()).isPresent()) {
             throw new RuntimeException("Cliente Cadastrado");
         }
         return clienteRepository.save(cliente);
}

     // PUT - UPDATE
    public  Cliente atualizar(UUID id, Cliente cliente){
        if (clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não cadastrado");
        }
        cliente.setId(id);
        Cliente clienteatualizado = clienteRepository.save(cliente);
        return  clienteatualizado;
}

    //DELETE
    public void excluir(UUID id){
        if (clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente deletado com sucesso.");
        }
        clienteRepository.deleteById(id);
}


}





