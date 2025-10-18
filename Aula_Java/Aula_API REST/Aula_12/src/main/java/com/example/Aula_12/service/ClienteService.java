package com.example.Aula_12.service;

import com.example.Aula_12.dto.ClienteRequestDTO;
import com.example.Aula_12.dto.ClienteResponseDTO;
import com.example.Aula_12.model.ClienteModel;
import com.example.Aula_12.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteResponseDTO> ListarTodos(){
        return clienteRepository
                .findAll()
                .stream()
                .map(u -> new ClienteResponseDTO(u.getNome(),u.getEmail(),u.getTelefone()))
                .toList();
    }

    public ClienteModel salvarCliente(ClienteRequestDTO clienteRequestDTO){
        if (clienteRepository.findByEmail(clienteRequestDTO.getEmail()).isPresent()){
            throw  new IllegalArgumentException("E-mail ja cadastrado");
        }
        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setNome(clienteRequestDTO.getNome());
        novoCliente.setEmail(clienteRequestDTO.getEmail());
        novoCliente.setTelefone(clienteRequestDTO.getTelefone());
        novoCliente.setFormaPagamento(clienteRequestDTO.getFormaPagamento());
        novoCliente.setEndereco(clienteRequestDTO.getEndereco());
        clienteRepository.save(novoCliente);
        return novoCliente;
    }

    public ClienteModel atualizarCliente(Long id, ClienteRequestDTO clienteRequestDTO){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado.");

        }
        ClienteModel atualizarCliente = new ClienteModel();
        atualizarCliente.setId(id);
        atualizarCliente.setNome(clienteRequestDTO.getNome());
        atualizarCliente.setEmail(clienteRequestDTO.getEmail());
        atualizarCliente.setTelefone(clienteRequestDTO.getTelefone());
        atualizarCliente.setFormaPagamento(clienteRequestDTO.getFormaPagamento());
        atualizarCliente.setEndereco(clienteRequestDTO.getEndereco());
        clienteRepository.save(atualizarCliente);
        return atualizarCliente;
    }

    public void deletarCliente(Long id){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado");
        }
        clienteRepository.deleteById(id);
    }



















}
