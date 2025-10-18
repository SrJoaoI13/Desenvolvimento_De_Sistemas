package com.example.Aula_12.dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "Deve conter no minino 3 caracteres")
    @Size(min = 3)
    private String nome;

    @NotBlank(message = "O e-mail é Obrigatorio")
    @Email(message = "O e-mail deve ser valido")
    private String email;

    @NotBlank(message = "Insirir o DDD + o numero")
    @Size(min = 11, max = 11,message = "Insira numero de telefone valido")
    private String telefone;

    @NotBlank(message = "Escolha a forma de pagamento")
    private String formaPagamento;

    @NotBlank(message = "Insira o endereco valido")
    private String endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, String telefone, String formaPagamento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.formaPagamento = formaPagamento;
        this.endereco = endereco;
    }

    public @NotBlank(message = "Deve conter no minino 3 caracteres") @Size(min = 3) String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Deve conter no minino 3 caracteres") @Size(min = 3) String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O e-mail é Obrigatorio") @Email(message = "O e-mail deve ser valido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é Obrigatorio") @Email(message = "O e-mail deve ser valido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Insirir o DDD + o numero") @Size(min = 11, max = 11, message = "Insira numero de telefone valido") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Insirir o DDD + o numero") @Size(min = 11, max = 11, message = "Insira numero de telefone valido") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "Escolha a forma de pagamento") String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(@NotBlank(message = "Escolha a forma de pagamento") String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public @NotBlank(message = "Insira o endereco valido") String getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "Insira o endereco valido") String endereco) {
        this.endereco = endereco;
    }
}
