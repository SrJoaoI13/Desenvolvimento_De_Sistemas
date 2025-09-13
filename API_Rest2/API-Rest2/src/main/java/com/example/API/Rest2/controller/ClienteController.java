package com.example.API.Rest2.controller;

import com.example.API.Rest2.model.Cliente;
import com.example.API.Rest2.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//responder apartir do /cliente
@RequestMapping("/cliente")
//nao precisa do construtor
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteRepository clienteRepository;

   public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listar(){
        //findall buscando todos cliento do banco de dados
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
       clienteRepository.save(cliente);
       return ResponseEntity.ok().body(cliente);
    }
}
