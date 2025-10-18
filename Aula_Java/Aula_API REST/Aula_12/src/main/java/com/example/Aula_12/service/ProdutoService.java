package com.example.Aula_12.service;

import com.example.Aula_12.dto.ProdutoRequestDTO;
import com.example.Aula_12.dto.ProdutoResponseDTO;
import com.example.Aula_12.model.ProdutoModel;
import com.example.Aula_12.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoResponseDTO> ListarTodos(){
        return produtoRepository
                .findAll()
                .stream()
                .map(u-> new ProdutoResponseDTO(u.getNome(), u.getLote(), u.getValidade(), u.getQuantidade()))
                .toList();
    }

    public ProdutoModel salvarProduto(ProdutoRequestDTO produtoRequestDTO){
        if (produtoRepository.findByLote(produtoRequestDTO.getLote()).isPresent()){
            throw new IllegalArgumentException("Lote ja cadastrado");
        }
        ProdutoModel novoProduto = new ProdutoModel();
        novoProduto.setNome(produtoRequestDTO.getNome());
        novoProduto.setLote(produtoRequestDTO.getLote());
        novoProduto.setValidade(produtoRequestDTO.getValidade());
        novoProduto.setCategoria(produtoRequestDTO.getCategoria());
        novoProduto.setQuantidade(produtoRequestDTO.getQuantidade());

        produtoRepository.save(novoProduto);
        return novoProduto;
    }

    public  ProdutoModel ataulizarProduto(Long id, ProdutoRequestDTO produtoRequestDTO){
        if (!produtoRepository.existsById(id)){
            throw new RuntimeException("Produto não encontrado");
        }
        ProdutoModel atualizarProduto = new ProdutoModel();
        atualizarProduto.setId(id);
        atualizarProduto.setNome(produtoRequestDTO.getNome());
        atualizarProduto.setLote(produtoRequestDTO.getLote());
        atualizarProduto.setValidade(produtoRequestDTO.getValidade());
        atualizarProduto.setCategoria(produtoRequestDTO.getCategoria());
        atualizarProduto.setQuantidade(produtoRequestDTO.getQuantidade());


        produtoRepository.save(atualizarProduto);
        return atualizarProduto;
    }

    public void  deletarProduto(Long id){
        if (!produtoRepository.existsById(id)){
            throw new RuntimeException("Produto não encontrado");
        }
        produtoRepository.deleteById(id);
    }


}
