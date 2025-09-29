package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/*const vazio
@NoArgsConstructor
 Constr
@AllArgsConstructor
 get, set toS
@Data
*/

@Entity
@Table(name = "Tab_Cliente")
public class Cliente {

    //chave primaria
    @Id
    // Auto increment

    //UUID gera um codigo numerico aleatorio
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // not null
    @Column(nullable = false)
    private String nome;

    //not null
    @Column(nullable = false)
    private String email;

    // cascade apagando o cliente apaga o endereco
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    // Enumerated endentificar que o campo esta associado a um enum
    @Enumerated(EnumType.STRING)
    private Setor setor;

    public Cliente() {
    }

    public Cliente(UUID id, String nome, String email, Endereco endereco, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.setor = setor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
