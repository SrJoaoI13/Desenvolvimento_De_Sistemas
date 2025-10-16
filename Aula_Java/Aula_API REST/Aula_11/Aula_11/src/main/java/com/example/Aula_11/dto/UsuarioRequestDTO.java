package com.example.Aula_11.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {

    @NotBlank(message = "O nome é obrigatorio")
    @Size(min = 3, message = "O nome deve ter bo minino 3 caracteres")
     private String nome;

    @NotBlank(message = "O e-mail é obrigatorio")
    @Email(message = "Deve ser um e-mail valido")
     private String email;

    @NotBlank(message = "A senha é obrigatoria")
    @Size(min = 3,max = 15,message = "Senha de 3 a 15 caracteristicas")
     private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatorio") @Size(min = 3, message = "O nome deve ter bo minino 3 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatorio") @Size(min = 3, message = "O nome deve ter bo minino 3 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O e-mail é obrigatorio") @Email(message = "Deve ser um e-mail valido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatorio") @Email(message = "Deve ser um e-mail valido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatoria") @Size(min = 3, max = 15, message = "Senha de 3 a 15 caracteristicas") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatoria") @Size(min = 3, max = 15, message = "Senha de 3 a 15 caracteristicas") String senha) {
        this.senha = senha;
    }
}
