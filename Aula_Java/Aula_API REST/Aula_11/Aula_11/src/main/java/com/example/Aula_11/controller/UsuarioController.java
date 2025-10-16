package com.example.Aula_11.controller;

import com.example.Aula_11.dto.UsuarioRequestDTO;
import com.example.Aula_11.dto.UsuarioResponseDTO;
import com.example.Aula_11.service.UsuarioService;
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

    //CREATe
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO dto){
        usuarioService.salvarUsuario(dto);
        return ResponseEntity
                .created(null)
                .body(Map.of(
                 "mensagem","Cadastrado com sucesso",
                        "sucesso",true
                ));
    }
    //READ
    @GetMapping
    public  ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
                .ok()
                .body(usuarioService.ListarTodos());
    }

    //UPDATE

    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody UsuarioRequestDTO dto){

        usuarioService.atualizarUsuario(id, dto);
        return ResponseEntity
                .ok()
                .body(Map.of(
                        "mensagem","Cadastrado com sucesso",
                        "sucesso",true
                ));
    }

    // DELETE
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id){
        usuarioService.excluirUsuario(id);
        return  ResponseEntity
                .ok()
                .body(Map.of("mensagem", "Excluir com sucesso"
                ,"sucesso",true ));
    }

}
