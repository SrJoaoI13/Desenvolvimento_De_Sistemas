package com.example.Aula_10.dto;


public class UsuarioResponseDTO {

    //Response sempre que consulta na tabela do banco de dados o response/resposta aparece o informado a baixo

    private String nome;
    private String email;

    public UsuarioResponseDTO() {
    }

    public UsuarioResponseDTO(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
