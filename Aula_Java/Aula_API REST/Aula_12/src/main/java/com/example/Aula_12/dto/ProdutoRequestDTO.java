package com.example.Aula_12.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProdutoRequestDTO {

    @NotBlank(message = "Nome do produto obrigatorio")
    @Size(min = 2,message = "Insira o nome com mais de 2 caracteres")
    private String nome;

    @NotBlank(message = "Lote é obrigatorio")
    private String lote;

    @NotBlank(message = "validade é obrigatorio")
    private String validade;

    @NotBlank(message = "Categoria é obrigatorio")
    private String categoria;

    @NotBlank(message = "Quantidade é obrigatorio")
    private int quantidade;

    public ProdutoRequestDTO() {
    }

    public ProdutoRequestDTO(String nome, String lote, String validade, String categoria, int quantidade) {
        this.nome = nome;
        this.lote = lote;
        this.validade = validade;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public @NotBlank(message = "Nome do produto obrigatorio") @Size(min = 2, message = "Insira o nome com mais de 2 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome do produto obrigatorio") @Size(min = 2, message = "Insira o nome com mais de 2 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Lote é obrigatorio") String getLote() {
        return lote;
    }

    public void setLote(@NotBlank(message = "Lote é obrigatorio") String lote) {
        this.lote = lote;
    }

    public @NotBlank(message = "validade é obrigatorio") String getValidade() {
        return validade;
    }

    public void setValidade(@NotBlank(message = "validade é obrigatorio") String validade) {
        this.validade = validade;
    }

    public @NotBlank(message = "Categoria é obrigatorio") String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank(message = "Categoria é obrigatorio") String categoria) {
        this.categoria = categoria;
    }

    @NotBlank(message = "Quantidade é obrigatorio")
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(@NotBlank(message = "Quantidade é obrigatorio") int quantidade) {
        this.quantidade = quantidade;
    }
}
