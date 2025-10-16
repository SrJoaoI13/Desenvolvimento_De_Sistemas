package com.example.Aula_10.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {

    // Request Validação de dados, no caso os dados enviados para a aplicação

    @NotBlank(message = "O nome é obrigatorio")
    private  String nome;

    @NotBlank(message = "O email é obrigatorio")
    @Email(message = "Deve ser um e-mail valido")
    private  String email;

    @NotBlank(message = "A senha é obrigatoria")
    @Size(min = 3, max = 20,message = "A senha deve ter entre 3 a 20 caracteres")
    private  String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatorio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatorio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatorio") @Email(message = "Deve ser um e-mail valido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatorio") @Email(message = "Deve ser um e-mail valido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatoria") @Size(min = 3, max = 20, message = "A senha deve ter entre 3 a 20 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatoria") @Size(min = 3, max = 20, message = "A senha deve ter entre 3 a 20 caracteres") String senha) {
        this.senha = senha;
    }
}
