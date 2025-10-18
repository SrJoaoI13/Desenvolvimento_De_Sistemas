package com.example.Aula_12.dto;

public class ProdutoResponseDTO {

    private String nome;
    private String lote;
    private String validade;
    private int quantidade;

    public ProdutoResponseDTO() {
    }

    public ProdutoResponseDTO(String nome, String lote, String validade, int quantidade) {
        this.nome = nome;
        this.lote = lote;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
