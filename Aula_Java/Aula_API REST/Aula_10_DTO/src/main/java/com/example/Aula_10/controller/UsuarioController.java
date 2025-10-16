package com.example.Aula_10.controller;

import com.example.Aula_10.dto.UsuarioRequestDTO;
import com.example.Aula_10.dto.UsuarioResponseDTO;
import com.example.Aula_10.model.UsuarioModel;
import com.example.Aula_10.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto){
        UsuarioModel usuario = usuarioService.salvarUsuario(dto);

        return ResponseEntity
                .created(null)
                .body(Map.of("mensagem","Usuario Cadastrado com sucesso",
                        "sucesso", true));
    }

    //Retorna uma lista com apenas o nome e o e-mail solicitados para aparecer do UsuarioResponseDTO
    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
                .ok()
                .body(usuarioService.listarTodos());
    }




}
