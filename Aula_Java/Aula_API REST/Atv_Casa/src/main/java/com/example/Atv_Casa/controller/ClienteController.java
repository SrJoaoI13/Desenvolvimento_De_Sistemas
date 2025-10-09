package com.example.Atv_Casa.controller;

import com.example.Atv_Casa.model.ClienteModel;
import com.example.Atv_Casa.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteModel> listar(){
        return clienteService.listarTodosClientes();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ClienteModel clienteModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "mensagem","Cliente Cadastrado com Sucesso",
                "cliente", clienteService.salvar(clienteModel)
        ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody ClienteModel clienteModel){
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "mensagem","Cliente Atualizado com Sucesso",
                "cliente", clienteService.atualizar(id, clienteModel)
        ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id){
        clienteService.excluir(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Cliente Excluido com Sucesso"));
    }
}
