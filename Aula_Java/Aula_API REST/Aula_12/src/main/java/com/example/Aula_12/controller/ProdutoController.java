package com.example.Aula_12.controller;

import com.example.Aula_12.dto.ProdutoRequestDTO;
import com.example.Aula_12.dto.ProdutoResponseDTO;
import com.example.Aula_12.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> listar() {
        return ResponseEntity
                .ok()
                .body(produtoService.ListarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @RequestBody ProdutoRequestDTO produtoRequestDTO
    ) {
        produtoService.ataulizarProduto(id, produtoRequestDTO);
        return ResponseEntity
                .ok()
                .body(Map.of("mensagem", "Produto atualizado", "sucesso", true));
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(
            @RequestBody ProdutoRequestDTO produtoRequestDTO
    ) {
        produtoService.salvarProduto(produtoRequestDTO);
        return ResponseEntity
                .ok()
                .body(Map.of("mensagem", "Cadastrado com sucesso", "sucesso", true));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(
            @PathVariable Long id
    ) {
        produtoService.deletarProduto(id);
        return ResponseEntity
                .ok()
                .body(Map.of("mensagem", "Deletado com sucesso", "sucesso", true));
    }
}
