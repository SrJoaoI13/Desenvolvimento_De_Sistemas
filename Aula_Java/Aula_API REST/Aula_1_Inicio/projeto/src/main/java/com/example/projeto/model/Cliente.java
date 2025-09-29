package com.example.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // long numeros inteiros com numero maiores que o int
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String Telefone;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        Telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", Telefone: '" + Telefone + '\'' +
                '}';
    }
}
