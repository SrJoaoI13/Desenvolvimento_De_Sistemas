package com.example.Aula_12.controller;

import com.example.Aula_12.dto.ClienteRequestDTO;
import com.example.Aula_12.dto.ClienteResponseDTO;
import com.example.Aula_12.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listar(){
        return ResponseEntity
                .ok()
                .body(clienteService.ListarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
        @PathVariable Long id,
        @RequestBody ClienteRequestDTO clienteRequestDTO
        ){
        clienteService.atualizarCliente(id, clienteRequestDTO);
        return ResponseEntity
                .created(null)
                .body(Map.of("mensagem","Atualizar Cliente","sucesso",true));
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(
            @RequestBody ClienteRequestDTO clienteRequestDTO) {

        clienteService.salvarCliente(clienteRequestDTO); //

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "mensagem", "Cadastrado com sucesso",
                        "sucesso", true
                ));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(
            @PathVariable Long id
    ){
        clienteService.deletarCliente(id);
        return  ResponseEntity
                .ok()
                .body(Map.of("mensagem","Deletado com sucesso"
                        ,"sucesso", true));
    }


}
